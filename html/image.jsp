<%@ page contentType="text/html; charset=utf-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>ブルセラ伝説</title>
		<link rel="stylesheet" type="text/css" href="hatena.css">
	</head>

	<body>

		<h1>ブルセラ伝説</h1>

		<div class=hatena-body>
		<div class=main>
		<div class=day>

		<img src="/kumagai/image?folder=LegendImageFolder&filename=<s:property value="topImagePath" />" usemap="#menu">
		<br>

		<map name="menu">
			<area shape="rect" coords="16,88,143,183" href="/kumagai/image?folder=LegendImageFolder&filename=<s:property value="imagesPath[0]"/>" alt="image1">
			<area shape="rect" coords="152,88,279,183" href="/kumagai/image?folder=LegendImageFolder&filename=<s:property value="imagesPath[1]"/>" alt="image2">
			<area shape="rect" coords="289,88,416,183" href="/kumagai/image?folder=LegendImageFolder&filename=<s:property value="imagesPath[2]"/>" alt="image3">
			<area shape="rect" coords="425,88,551,183" href="/kumagai/image?folder=LegendImageFolder&filename=<s:property value="imagesPath[3]"/>" alt="image4">

			<area shape="rect" coords="16,192,143,288" href="/kumagai/image?folder=LegendImageFolder&filename=<s:property value="imagesPath[4]"/>" alt="image5">
			<area shape="rect" coords="152,192,279,288" href="/kumagai/image?folder=LegendImageFolder&filename=<s:property value="imagesPath[5]"/>" alt="image6">
			<area shape="rect" coords="289,192,416,288" href="/kumagai/image?folder=LegendImageFolder&filename=<s:property value="imagesPath[6]"/>" alt="image7">
			<area shape="rect" coords="425,192,551,288" href="/kumagai/image?folder=LegendImageFolder&filename=<s:property value="imagesPath[7]"/>" alt="image8">

			<area shape="rect" coords="16,296,143,391" href="/kumagai/image?folder=LegendImageFolder&filename=<s:property value="imagesPath[8]"/>" alt="image9">
			<area shape="rect" coords="152,296,279,391" href="/kumagai/image?folder=LegendImageFolder&filename=<s:property value="imagesPath[9]"/>" alt="image10">
			<area shape="rect" coords="289,296,416,391" href="/kumagai/image?folder=LegendImageFolder&filename=<s:property value="imagesPath[10]"/>" alt="image11">
			<area shape="rect" coords="425,296,551,391" href="/kumagai/image?folder=LegendImageFolder&filename=<s:property value="imagesPath[11]"/>" alt="image12">

			<area shape="rect" coords="576,256,624,319" href="/kumagai/image?folder=LegendImageFolder&filename=<s:property value="movieImage1Path"/>" alt="movie1">
			<area shape="rect" coords="576,328,624,391" href="/kumagai/image?folder=LegendImageFolder&filename=<s:property value="movieImage2Path"/>" alt="movie2">

			<area shape="rect" coords="576,16,624,48" href="/kumagai/diary/oneday1?date=<s:property value="reviewDate1" />&category=AV鑑賞&usetag=true" alt="review">

			<s:if test="%{reviewDate2 != null}">
				<area shape="rect" coords="576,64,624,96" href="/kumagai/diary/oneday1?date=<s:property value="reviewDate2" />&category=AV鑑賞&usetag=true" alt="review">
			</s:if>
		</map>

		</div>
		</div>
		</div>

	</body>
</html>
