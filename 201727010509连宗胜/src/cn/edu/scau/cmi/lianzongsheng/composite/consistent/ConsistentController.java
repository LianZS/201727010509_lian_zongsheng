package cn.edu.scau.cmi.lianzongsheng.composite.consistent;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ResourceBundle;

import com.sun.org.apache.xpath.internal.operations.Or;

import cn.edu.scau.cmi.lianzongsheng.composite.safe.SafeOrganization;
import cn.edu.scau.cmi.lianzongsheng.composite.safe.SafePerson;
import cn.edu.scau.cmi.lianzongsheng.composite.safe.SafeTeam;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class ConsistentController  implements Initializable{
	private ToggleGroup modelGroup;
	private ToggleGroup deleteModelGroup;
	@FXML
	private TextArea showTree;
	@FXML
	private TextField organizationInput;
	@FXML
	private TextField teamInput;
	@FXML
	private TextField teamerInput;
	@FXML
	private TextField deleteTeamInput;
	@FXML
	private TextField deleteTeamerInput;
	@FXML
	private Button addOrganizationButton;
	@FXML
	private Button addTeamButton;
	@FXML
	private Button addTeamerButton;
	@FXML
	private Button deleteButton;
	@FXML
	private RadioButton consistentRadio;
	@FXML
	private RadioButton safeRadio;

	private Organization organization;
	private SafeOrganization safeorganization;
	private HashMap<String, Team> teamMap;
	private HashMap<String,SafeTeam > safeTeamMap;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		modelGroup =new ToggleGroup();
		deleteModelGroup =new ToggleGroup();
		consistentRadio.setToggleGroup(modelGroup);
		safeRadio.setToggleGroup(modelGroup);

		consistentRadio.setSelected(true);
		
		
	}

	public void addOrganization() {
		
		String organizationName = organizationInput.getText();

		if(consistentRadio.isSelected()) {
			this.teamMap =new HashMap<>();

			this.organization =new Team();
			((Team)this.organization).setTeamName(organizationName);

		}
		else {
			this.safeTeamMap=new HashMap<>();
			this.safeorganization =new SafeTeam();
			((SafeTeam)this.safeorganization).setName(organizationName);
		}
	}
	
	public void addTeam() {
		if(this.organization==null || this.safeorganization==null) {
			addOrganization();
		}
		String teamName = teamInput.getText();
		if(teamName==null) {
			return ;
		}
		if(consistentRadio.isSelected()) {
			Team team;
			team = teamMap.get(teamName);
			if(team==null) {
				team = new Team();
				team.setTeamName(teamName);
				teamMap.put(teamName, team);
				organization.addChild(team);
			}
		}
		else {
			SafeTeam safeteam;
			safeteam = safeTeamMap.get(teamName);
			if(safeteam==null) {
				safeteam = new SafeTeam();
				safeteam.setName(teamName);
				safeTeamMap.put(teamName, safeteam);
				((SafeTeam)safeorganization).addChild(safeteam);
			}
		}
		show();
		return ;

		
		
	}

	public void addTeamer() {
		String teamName = teamInput.getText();
		String personName = teamerInput.getText();
		if( personName==null) {
			return ;
		}
	
		if(consistentRadio.isSelected()) {
			Person p =new Person();
			p.setName(personName);
			if(teamName ==null) {
				this.organization.addChild(p);
			}
			else {
				Team team = teamMap.get(teamName);
				team.addChild(p);
			}

		}
		else {
			SafePerson p=new SafePerson();
			p.setName(personName);
			if(teamName==null) {
				((SafeTeam)this.safeorganization).addChild(p);
			}
			else {
				SafeTeam team = safeTeamMap.get(teamName);
				team.addChild(p);
			}

			
		}

		show();
		return ;
		
		
	}
	public void show() {
		if(consistentRadio.isSelected()) {
			this.showTree.setText(consistentformatTree());

		}
		else {
			this.showTree.setText(safeformatTree());

		}
		
	}
	public void remove() {
		String teamName = deleteTeamInput.getText();
		String personName = deleteTeamerInput.getText();
		
		if(teamName.length()==0 &&personName.length()==0)
			return;
		else if(teamName.length()>0 &&personName.length()==0)
			removeTeam(teamName);
		else if(teamName.length()>0&&personName.length()>0) 
			removeTeamer(teamName, personName);
		
		
	}
	public void removeTeam(String team) {
		if(consistentRadio.isSelected()) {
			Team t = this.teamMap.get(team);
			this.organization.removeChild(t);
		}
		else {
			SafeTeam t = this.safeTeamMap.get(team);
			((SafeTeam)this.safeorganization).remove(t);
		}
		show();
	}
	public void removeTeamer(String team,String teamer) {
		if(consistentRadio.isSelected()) {
			Team t = this.teamMap.get(team);
			if(t !=null) {
				Person needDelete=null;
				for(Organization p:t.getChildren()) {
					String name = ((Person)p).getName();
					System.out.println(name);

					if(teamer.equals(name)) {
						needDelete=(Person) p;
						System.out.println("ok");

						break;
							
						}
					}
			t.removeChild(needDelete);

				}
			
			
		}
		else {
			SafePerson needDelete=null;
			SafeTeam t = this.safeTeamMap.get(team);
			if(t!=null) {
				for(SafeOrganization p:t.getChildren()) {
					String name = ((SafePerson)p).getName();
					if(teamer.equals(name)) {
						needDelete=(SafePerson) p;
						break;
						
					}
				}
			}
		
			t.remove(needDelete);
		}
		show();
	}
	
	public String consistentformatTree() {
		String organizationStr ="";
		ArrayList<String> teamStr=new ArrayList<>();
		HashMap<String, ArrayList<String>> treeMap = new HashMap<>();
		String organizationName =((Team)this.organization).getTeamName();
		HashSet<Organization> teams = ((Team)this.organization).getChildren();
		Iterator<Organization> teamsIterator = teams.iterator();
		organizationStr =organizationStr+((Team)this.organization).getTeamName()+"--";

		while(teamsIterator.hasNext()) {
			ArrayList<String> teamerStr=new ArrayList<>();

			Team team  = (Team) teamsIterator.next();
			String teamName = team.getTeamName();
			teamStr.add(teamName);
		
			for(Organization person:team.getChildren()) {
				String personName = ((Person)person).getName();
				teamerStr.add(personName);
			}
			treeMap.put(teamName, teamerStr);
			
		}
		String teamTree = "";
		for(int i=0;i<teamStr.size();i++) {
				String teamName = teamStr.get(i);
				if(i==0) {
					teamTree+="|-"+teamName+"---";

				}
				else {
					String formatStr="";
					for(int k=0;k<organizationStr.length();k++) {
						formatStr+=" ";
					}
					teamTree+="\n"+formatStr+"|-"+teamName+"---";

				}
				ArrayList<String> teamers = treeMap.get(teamName);
				String teamerTree = "";
				int j=0;
				for(String personName:teamers) {
					if(j==0) {
					
					}	
				
					else {
						int formatleng = teamName.length()+organizationStr.length()+5;
						for(int k=0;k<formatleng;k++){
							teamerTree+=" ";
							
						}

					}
					j+=1;
					teamerTree+="|-"+personName+"\n";
					
				}
				teamTree+=teamerTree;
			}
		return organizationStr+teamTree;
	}
	public String safeformatTree() {
		String organizationStr ="";
		ArrayList<String> teamStr=new ArrayList<>();
		HashMap<String, ArrayList<String>> treeMap = new HashMap<>();
		String organizationName =((SafeTeam)this.safeorganization).getName();
		HashSet<SafeOrganization> teams = ((SafeTeam)this.safeorganization).getChildren();
		Iterator<SafeOrganization> teamsIterator = teams.iterator();
		organizationStr =organizationStr+((Team)this.organization).getTeamName()+"--";

		while(teamsIterator.hasNext()) {
			ArrayList<String> teamerStr=new ArrayList<>();

			SafeTeam team  = (SafeTeam) teamsIterator.next();
			String teamName = team.getName();
			teamStr.add(teamName);
		
			for(SafeOrganization person:team.getChildren()) {
				String personName = ((SafePerson)person).getName();
				teamerStr.add(personName);
			}
			treeMap.put(teamName, teamerStr);
			
		}
		String teamTree = "";
		for(int i=0;i<teamStr.size();i++) {
				String teamName = teamStr.get(i);
				if(i==0) {
					teamTree+="|-"+teamName+"---";

				}
				else {
					String formatStr="";
					for(int k=0;k<organizationStr.length();k++) {
						formatStr+=" ";
					}
					teamTree+="|\n"+formatStr+"|-"+teamName+"---";

				}
				ArrayList<String> teamers = treeMap.get(teamName);
				String teamerTree = "";
				int j=0;
				for(String personName:teamers) {
					if(j==0) {
					
					}	
				
					else {
						int formatleng = teamName.length()+organizationStr.length()+5;
						for(int k=0;k<formatleng;k++){
							teamerTree+=" ";
						}

					}
					j+=1;
					teamerTree+="|-"+personName+"\n";
					
				}
				teamTree+=teamerTree;
			}
		return organizationStr+teamTree;
	}

}
