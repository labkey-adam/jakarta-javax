cd out\production\jakarta-javax\
jar cf jakarta-javax.jar javax/el/*.class javax/servlet/annotation/*.class javax/servlet/*.class javax/servlet/*.properties javax/servlet/http/*.properties javax/servlet/http/*.class javax/servlet/jsp/*.class javax/servlet/jsp/el/*.class javax/servlet/jsp/tagext/*.class javax/servlet/descriptor/*.class org/apache/jasper/runtime/*.class
copy jakarta-javax.jar c:\repos\tomcat\output\build\lib
cd ..\..\..
