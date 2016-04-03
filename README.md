# Struts2TilesTutorial
## Steps performed in the development of struts Application with Annotations using Maven

-web.xml
	-<listener>
     <listener-class>org.apache.struts2.tiles.StrutsTilesListener</listener-class>
     </listener>
	 Listener used to automatically inject ServletContext init parameters so that they don't need to be configured explicitly for tiles integration.
	-org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter
	 Handles both the preparation and execution phases of the Struts dispatching process.
	-Now add the filter mapping and welcome file list.