set ProjectPath=/Users/kishorekumar.kuppus/Documents/ATG/ATGMaven
echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\Lib\*
echo %classpath%
java org.testng.TestNG %ProjectPath%\atg.xml