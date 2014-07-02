<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head></head>
<body>
	<h4>
	<!-- Sort tags -->
<s:bean name="com.action.StudentComparator" var="studentComparator"> </s:bean>
		<s:sort comparator="studentComparator" source="students">
		<s:iterator>
<s:property  value="name" />
<s:property  value="rollNo" />
		</s:iterator>
		</s:sort>
	<!-- 	select tag -->
		<s:select name="name" list="studentNames" >
		</s:select> 
		<!-- Iterator tag -->
		<s:iterator value="studentNames" var="names">
		<s:property value="names"/>
		</s:iterator>
		<!-- Iterator tag with decider -->
		<s:subset decider="studentsDecider" source="students">
		<s:iterator>
		<s:property value="name"/>
		<s:property value="rollNo"/>
		</s:iterator>
		</s:subset>
	</h4>
	
</body>
</html>