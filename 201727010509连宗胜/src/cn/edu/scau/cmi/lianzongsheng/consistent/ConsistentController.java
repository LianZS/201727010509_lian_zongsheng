package cn.edu.scau.cmi.lianzongsheng.consistent;

import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ResourceBundle;

import com.sun.org.apache.xpath.internal.operations.Or;

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
	@FXML
	private RadioButton teamRadio;
	@FXML
	private RadioButton teamerRadio;
	private Organization organization;
	private HashMap<String, Team> teamMap;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		modelGroup =new ToggleGroup();
		deleteModelGroup =new ToggleGroup();
		consistentRadio.setToggleGroup(modelGroup);
		safeRadio.setToggleGroup(modelGroup);
		teamerRadio.setToggleGroup(deleteModelGroup);
		teamRadio.setToggleGroup(deleteModelGroup);
		this.organization =new Team();
		this.teamMap =new HashMap<>();
		
		
	}
	public void addOrganization() {
		String teamname = organizationInput.getText();
		((Team)this.organization).setTeamName(teamname);
	}
	
	public void addTeam() {
		String teamName = teamInput.getText();
		if(teamName==null) {
			return ;
		}
		Team team;
		team = teamMap.get(teamName);
		if(team==null) {
			team = new Team();
			team.setTeamName(teamName);
			teamMap.put(teamName, team);
			organization.addChild(team);
		}
		return ;

		
		
	}
	
	public void addTeamer() {
		String teamName = teamInput.getText();
		String personName = teamerInput.getText();
		if(teamName==null | personName==null) {
			return ;
		}
		Team team = teamMap.get(teamName);
		Person p =new Person();
		p.setName(personName);
		team.addChild(p);
		show();
		return ;
		
		
	}
	public void show() {
		String str =null;
		String organizationName =((Team)this.organization).getTeamName();
		HashSet<Organization> teams = ((Team)this.organization).getChildren();
		Iterator<Organization> teamsIterator = teams.iterator();
		while(teamsIterator.hasNext()) {
			Team team  = (Team) teamsIterator.next();
			String teamName = team.getTeamName();
			for(Organization person:team.getChildren()) {
				String personName = ((Person)person).getName();
	
				
			}
			
		}
		
		
		
	}

}
