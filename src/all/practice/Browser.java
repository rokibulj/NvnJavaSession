package all.practice;

import java.util.ArrayList;

public class Browser {
	
	String name;
	int version;
	ArrayList<String> plugins;
	
	
	
	
	public Browser(String name, int version, ArrayList<String> plugins) {
		this.name = name;
		this.version = version;
		this.plugins = plugins;
	}




	public static void main(String[] args) {
		
		ArrayList<String> plugins = new ArrayList<String>();
		plugins.add("firepath");
		plugins.add("chropath");
		
		Browser b1 = new Browser("Google", 78, plugins);
		
		System.out.println(b1.name);
		System.out.println(b1.version);
		System.out.println(plugins.get(1));
		
		int total = plugins.size();
		System.out.println(total);
		
		for(int i=0; i<total; i++){
			System.out.println(plugins.get(i));
		}
		
	}

}
