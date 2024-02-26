package com.spring.standaloneCollection;
import java.util.List;
import java.util.Map;
import java.util.Properties;

	public class People {
	   private List<String> army;
	   private Map<String, Integer> cricketTeam;
	   private Properties props;
	
	public List<String> getArmy() {
		return army;
	}
	
	public void setArmy(List<String> army) {
		this.army = army;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "People [army=" + army + ", cricketTeam=" + cricketTeam + "]";
	}

	public Map<String, Integer> getCricketTeam() {
		return cricketTeam;
	}

	public void setCricketTeam(Map<String, Integer> cricketTeam) {
		this.cricketTeam = cricketTeam;
	}
	
}
