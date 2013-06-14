<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Welcome to Grails</title>    
    </head>
    <body>
        <a href="#page-body" class="skip"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div id="status" role="complementary">
          
        </div>
        <div id="page-body" role="main">
            <h2>Friends:</h2>
            <ul>
                <g:each var="f" in="${friends}">
                    <li>${f.username}</li>    
                </g:each>
            </ul>
        </div>
    </body>
</html>
