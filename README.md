# Struts2TilesTutorial

## Struts 2 Architecture Flow

1. User sends a request for the action
2. Container maps the request in the WebController(web.xml) and gets the class name of controller.
3. Container then invokes the controller [StrutsPrepareAndExecuteFilter / FilterDispatcher(version <=2.1)]
4. Controller gets the information for the action from the ActionMapper
5. Controller invokes the ActionProxy
6. ActionProxy gets the information of action and interceptor stack from the configuration manager which gets the information from the struts.xml file.
7. ActionProxy forwards the request to the ActionInvocation
8. ActionInvocation invokes each interceptors and action
9. A result is generated
10. The result is sent back to the ActionInvocation
11. A HttpServletResponse is generated
12. Response is sent to the user

## Steps performed in the development of struts Application with Annotations using Maven

- web.xml
	- <listener>
      <listener-class>org.apache.struts2.tiles.StrutsTilesListener</listener-class>
      </listener>
	  > Listener used to automatically inject ServletContext init parameters so that they don't need to be configured explicitly for tiles integration.
	- org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter
	  > Handles both the preparation and execution phases of the Struts dispatching process.
	- Now add the filter mapping and welcome file list.
-Components
	1. Action
				Create an action class which will contain complete business logic and control the interaction between the user, the model, and the view.
	2. Interceptors
				Create interceptors if required, or use existing interceptors. This is part of Controller.
	3. View
				Create a JSPs to interact with the user to take input and to present the final messages.
	4. Configuration Files
				Create configuration files to couple the Action, View and Controllers. These files are struts.xml, web.xml, struts.properties.