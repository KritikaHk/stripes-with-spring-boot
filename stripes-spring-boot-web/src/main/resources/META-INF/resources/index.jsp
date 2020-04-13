<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head>
  <title>Stripe With Spring Boot POC </title>
  <style type="text/css">
    input.error { background-color: yellow; }
  </style> 
</head>
<body>
<h1>Stripes Action </h1>
 
" Let's know your name "
 
<stripes:form beanclass="com.hk.poc.actions.ShowNameActionBean" focus="">
<stripes:errors/>
    <table>
        <tr>
            <td>Name : </td>
            <td><stripes:text name="name"/></td>
        </tr>

        <tr>
            <td>Result:</td>
            <td>${actionBean.result}</td>
        </tr>
    </table>
</stripes:form>
</body>
</html>     