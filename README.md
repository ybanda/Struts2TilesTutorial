# Struts2TilesTutorial
## Steps performed in the development of struts Application with Annotations using Maven

1.web.xml
	1.1 <listener>
    <listener-class>org.apache.struts2.tiles.StrutsTilesListener</listener-class>
  </listener>
	Listener used to automatically inject ServletContext init parameters so that they don't need to be configured explicitly for tiles integration.
	1.2 org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter
	Handles both the preparation and execution phases of the Struts dispatching process.
	1.3 Now add the filter mapping and welcome file list.