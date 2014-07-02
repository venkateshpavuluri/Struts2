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
		<!-- Merge tag -->
		
		<s:merge id="allStudents">
		<s:param value="students"></s:param>
			<s:param value="listOfstudents"></s:param>
		</s:merge>
<br>merge tag
<br>

		<s:iterator value="allStudents">
		<s:property value="name"/>
		<s:property value="rollNo"/>
		</s:iterator>
		<br> append tag</br>
				<!-- Append tag -->
				<s:append  id="allStudentsAppend">
		<s:param value="students"></s:param>
			<s:param value="listOfstudents"></s:param>
		</s:append>
		<s:iterator value="%{#allStudentsAppend}">
		<s:property value="name"/>
		<s:property value="rollNo"/>
		</s:iterator>
		<!-- generator tag -->
		<s:generator val="%{'Violet,Indigo,Blue,
         Green,Yellow,Orange,Red '}" count="4" 
         separator=",">
   <s:iterator>
      <s:property /><br/>
   </s:iterator>
</s:generator>	

<!-- CheckBox List -->
<s:checkboxlist name="name"  list="studentNames"></s:checkboxlist>
<!-- Radio Buttons -->
<s:radio list="studentNames"  name="name"></s:radio>
<s:checkbox ></s:checkbox>
	</h4>
</body>
</html>