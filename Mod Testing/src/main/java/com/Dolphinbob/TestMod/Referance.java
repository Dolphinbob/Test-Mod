package com.Dolphinbob.TestMod;

public class Referance {
	public static final String MOD_ID = "TestMod";
	public static final String NAME = "Test Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_MINECRAFT_VERSIONS = "[1.12]";
	
	public static final String CLIENT_PROXY_CLASS = "com.Dolphinbob.TestMod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.Dolphinbob.TestMod.proxy.ServerProxy";
	
	public static enum Items {
    	DIRTSWORD("dirtsword", "DirtSword");
		
    	private String unlocalizedName;
		private String registryName;
		
		Items(String unlocalizedName, String registryName) {
    		this.unlocalizedName = unlocalizedName;
    		this.registryName = registryName;
    		
    	}
    	
    	public String getUnlocalizedName() {
			return unlocalizedName;
		}
    	
    	public String getRegistryName() {
			return registryName;
		}
	}
	
	 public static enum Blocks {
	    		    	
	    	private String unlocalizedName;
	    	private String registryName;
	    	
	    	Blocks(String unlocalizedName, String registryName) {
	    		this.unlocalizedName = unlocalizedName;
	    		this.registryName = registryName;
	    		
	    	}
	    	
	    	public String getUnlocalizedName() {
				return unlocalizedName;
			}
	    	
	    	public String getRegistryName() {
				return registryName;
			}
	    }
}
