<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<!-- saved from url=(0050)http://localhost:8080/HouseRent/manage!list.action -->
<HTML xmlns="http://www.w3.org/1999/xhtml"><HEAD>
  <TITLE>布谷租房 - 用户管理</TITLE>
  <META content="text/html; charset=utf-8" http-equiv=Content-Type><LINK
        rel=stylesheet type=text/css href="../../css/style.css">

  <META name=GENERATOR ></HEAD>
<BODY>
<DIV id=header class=wrap>
  <DIV id=logo><IMG src="../../images/logo.gif"></DIV>
  <DIV class=search><LABEL class="ui-green searchs"><a href="../../fabu.jsp" title="">发布房屋信息</a></LABEL>
    <LABEL class=ui-green><INPUT onclick=outl() value="退出" type=button name=search></LABEL>
  </DIV></DIV>
<DIV class="main wrap">
  <DIV id=houseArea>
    <input type="hidden" id="pageNum" name="pageNum">
    <TABLE class=house-list>
     <form:form action="/house/guanlihId=${house.HId}" method="post" id="sform" >
      <TBODY>
      <c:forEach items="${pageInfo.list}" var="house">
      <TR>
        <TD class=house-thumb><SPAN><A href="/house/details?hId=${house.HId}" target="_blank"><img src="/house/images?imgName=${house.HImg}" width="100" height="75" alt=""></A></SPAN></TD>
        <TD>
          <DL>
            <DT><A href="/house/details?hId=${house.HId}" target="_blank">${house.HName}</A></DT>
            <DD>${house.HLoc1}-${house.HLoc2},${house.HRect}平米<BR>联系方式：123 </DD></DL></TD>
        <TD class=house-type><LABEL class=ui-green><INPUT  value="修    改" type=button name=search onclick="upd(${house.HId})"></LABEL></TD>
        <TD class=house-price><LABEL class=ui-green><INPUT value="删    除" type=button name=search onclick="del(${house.HId})" ></LABEL></TD></TR>
      </c:forEach> </TBODY></form:form></TABLE></DIV>
  <DIV class=pager>
    <UL>
      <LI class=current><A href="?pageNum=${pageInfo.firstPage}">首页</A></LI>
      <LI><A href="javascript:void(0)" onclick="dosubmit(${pageInfo.hasPreviousPage?pageInfo.prePage:pageInfo.pageNum})">上一页</A></LI>
      <LI><A href="javascript:void(0)" onclick="dosubmit(${pageInfo.hasNextPage?pageInfo.nextPage:pageInfo.pageNum})">下一页</A></LI>
      <LI><A href="javascript:void(0)" onclick="dosubmit(${pageInfo.pages})">末页</A></LI></UL><SPAN
          class=total>${pageInfo.pageNum}/${pageInfo.pages}页</SPAN> </DIV></DIV>

<%--<UL>
      <LI class=current><A id=widget_338868862
                           href="http://localhost:8080/HouseRent/manage!ajaxList.action?number=1"
                           parseContent="true" showError="true" targets="houseArea"
                           ajaxAfterValidation="false" validate="false"
                           dojoType="struts:BindAnchor">1</A>
      </LI>--%>
      <%--<LI class=current><A id=widget_1160989910
                           href="http://localhost:8080/HouseRent/manage!ajaxList.action?number=2"
                           parseContent="true" showError="true" targets="houseArea"
                           ajaxAfterValidation="false" validate="false"
                           dojoType="struts:BindAnchor">2</A>
      </LI></UL><SPAN class=total>1/2页</SPAN> </DIV></DIV>--%>
<DIV id=footer class=wrap>
  <script>
    function del(hId) {
      location.href="/house/delete?hId="+hId;

    }
    function upd(hId) {
      location.href="/house/update?hId="+hId;
    }
    function outl() {
      location.href="/user/outlogin"
    }
    function dosubmit(pageNum) {
      var p=document.getElementById("pageNum");
      p.value=pageNum;
      var form=document.getElementById("sform");
      form.submit();
    }
  </script>
  <DL>
    <DT>布谷租房 © 2010 布谷租房 京ICP证1000001号</DT>
    <DD>关于我们 · 联系方式 · 意见反馈 · 帮助中心</DD></DL></DIV></BODY></HTML>
