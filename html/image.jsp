<%@ page contentType="text/html; charset=utf-8" %>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>ブルセラ伝説</title>
		<link rel="stylesheet" type="text/css" href="<html:rewrite page="/regend/hatena.css"/>">
	</head>

	<body>

		<h1>ブルセラ伝説</h1>

		<div class=hatena-body>
		<div class=main>
		<div class=day>

		<img src="/kumagai/image?folder=RegendImageFolder&filename=<bean:write name="RegendImageForm" property="topImagePath"/>" usemap="#menu">
		<br>

		<map name="menu">
			<area shape="rect" coords="16,88,143,183" href="/kumagai/image?folder=RegendImageFolder&filename=<bean:write name="RegendImageForm" property="image1Path"/>" alt="image1">
			<area shape="rect" coords="152,88,279,183" href="/kumagai/image?folder=RegendImageFolder&filename=<bean:write name="RegendImageForm" property="image2Path"/>" alt="image2">
			<area shape="rect" coords="289,88,416,183" href="/kumagai/image?folder=RegendImageFolder&filename=<bean:write name="RegendImageForm" property="image3Path"/>" alt="image3">
			<area shape="rect" coords="425,88,551,183" href="/kumagai/image?folder=RegendImageFolder&filename=<bean:write name="RegendImageForm" property="image4Path"/>" alt="image4">

			<area shape="rect" coords="16,192,143,288" href="/kumagai/image?folder=RegendImageFolder&filename=<bean:write name="RegendImageForm" property="image5Path"/>" alt="image5">
			<area shape="rect" coords="152,192,279,288" href="/kumagai/image?folder=RegendImageFolder&filename=<bean:write name="RegendImageForm" property="image6Path"/>" alt="image6">
			<area shape="rect" coords="289,192,416,288" href="/kumagai/image?folder=RegendImageFolder&filename=<bean:write name="RegendImageForm" property="image7Path"/>" alt="image7">
			<area shape="rect" coords="425,192,551,288" href="/kumagai/image?folder=RegendImageFolder&filename=<bean:write name="RegendImageForm" property="image8Path"/>" alt="image8">

			<area shape="rect" coords="16,296,143,391" href="/kumagai/image?folder=RegendImageFolder&filename=<bean:write name="RegendImageForm" property="image9Path"/>" alt="image9">
			<area shape="rect" coords="152,296,279,391" href="/kumagai/image?folder=RegendImageFolder&filename=<bean:write name="RegendImageForm" property="image10Path"/>" alt="image10">
			<area shape="rect" coords="289,296,416,391" href="/kumagai/image?folder=RegendImageFolder&filename=<bean:write name="RegendImageForm" property="image11Path"/>" alt="image11">
			<area shape="rect" coords="425,296,551,391" href="/kumagai/image?folder=RegendImageFolder&filename=<bean:write name="RegendImageForm" property="image12Path"/>" alt="image12">

			<area shape="rect" coords="576,256,624,319" href="/kumagai/image?folder=RegendImageFolder&filename=<bean:write name="RegendImageForm" property="movieImage1Path"/>" alt="movie1">
			<area shape="rect" coords="576,328,624,391" href="/kumagai/image?folder=RegendImageFolder&filename=<bean:write name="RegendImageForm" property="movieImage2Path"/>" alt="movie2">

			<area shape="rect" coords="576,16,624,48" href="OneDay.do?date=<bean:write name="RegendImageForm" property="reviewDate1" />&category=生活２&usetag=true" alt="review">

			<logic:notEmpty name="RegendImageForm" property="reviewDate2">
				<area shape="rect" coords="576,64,624,96" href="OneDay.do?date=<bean:write name="RegendImageForm" property="reviewDate2" />&category=生活２&usetag=true" alt="review">
			</logic:notEmpty>
		</map>

		</div>
		</div>
		</div>

	</body>
</html>
