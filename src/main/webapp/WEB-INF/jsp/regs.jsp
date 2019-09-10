
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<!-- saved from url=(0049)http://localhost:8080/HouseRent/page/register.jsp -->
<HTML xmlns="http://www.w3.org/1999/xhtml"><HEAD><TITLE>布谷租房 - 用户注册</TITLE>
<META content="text/html; charset=utf-8" http-equiv=Content-Type><LINK 
rel=stylesheet type=text/css href="../../css/style.css">
<META name=GENERATOR content="MSHTML 8.00.7601.17514"></HEAD>
<BODY>
<DIV id=header class=wrap>
<DIV id=logo><IMG src="../../images/logo.gif"></DIV></DIV>
<DIV id=regLogin class=wrap>
<DIV class=dialog>
<DL class=clearfix>
  <DT>新用户注册</DT>
  <DD class=past>填写个人信息</DD></DL>
<DIV class=box>

  <form:form action="/user/doreg" method="post" modelAttribute="userVO">
<DIV class=infos>
<TABLE class=field>
  <TBODY>
  <TR>
    <TD class=field>用 户 名：</TD>
    <TD><INPUT class=text type=text name=name onblur="valid(this)"><form:errors path="name"></form:errors> </TD></TR>
  <TR>
    <TD class=field>密　　码：</TD>
    <TD><INPUT class=text type=password name=password></TD></TR>
  <TR>
    <TD class=field>确认密码：</TD>
    <TD><INPUT class=text type=password name=repassword> </TD></TR>
  <TR>
    <TD class=field>电　　话：</TD>
    <TD><INPUT class=text type=text name=telephone> </TD></TR>
  <TR>
    <TD class=field>用户姓名：</TD>
    <TD><INPUT class=text type=text name=username> </TD></TR></TBODY></TABLE>
<DIV class=buttons>
<INPUT  value=立即注册 type=submit>
</DIV></DIV></form:form></DIV></DIV></DIV>
<DIV id=footer class=wrap>
<DL>
 <script src="http://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
  <script>
    function valid(th) {
     $.ajax({
        "method":"post",
        "ContentType":"application/json",
        "url":"/user/valid",
        "success":function (data) {
          if(!data.result){
            console("用户名不正确");
          }

        },
        "data":'("name"+"'+th.value+'")',
        "dataType":"json"

      })
    }
  </script>
  <DT>布谷租房 © 2010 布谷租房 京ICP证1000001号</DT>
  <DD>关于我们 · 联系方式 · 意见反馈 · 帮助中心</DD></DL></DIV></BODY></HTML>
