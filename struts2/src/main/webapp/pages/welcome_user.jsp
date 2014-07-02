<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head></head>
<body>
	<h4>
<s:bean name="com.action.StudentComparator" var="studentComparator"> </s:bean>
		<s:sort comparator="studentComparator" source="students">
		<s:iterator>
<s:property  value="name" />
<s:property  value="rollNo" />
		</s:iterator>
		</s:sort>
	<%-- 	<s:select name="name" list="list" >
		
		</s:select> --%>
	</h4>
</body>
</html>