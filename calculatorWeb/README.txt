Tomcat 8.5, Maven 3.8.1, Java 8, SonarQube were used in this project and wsimport and wsdl were pulled from "http://www.dneonline.com/calculator.asmx?WSDL".
CodeSmeller in SonarQube has remained so because the methods are in the soap service part.
The project was run with Maven commands via PowerShell and SonarQube screenshots were added.
Logging operations were done with Log4j. The logs are saved both on the console and on the local disk. The location where the logs will be saved can be changed from the "log4j.properties" file.