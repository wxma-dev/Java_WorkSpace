/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.63
 * Generated at: 2017-08-29 06:51:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class updateplan_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\ttable {\r\n");
      out.write("\t\tborder: 2px #CCCCCC solid;\r\n");
      out.write("\t\twidth: 90%;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\ttd,th {\r\n");
      out.write("\t\theight: 30px;\r\n");
      out.write("\t\tborder: #CCCCCC 1px solid;\r\n");
      out.write("\t}\r\n");
      out.write("\ttextarea{\r\n");
      out.write("\t\t border:none;\r\n");
      out.write("\t\t overflow:hidden;\r\n");
      out.write("\t\t height:100%;\r\n");
      out.write("\t\t width:100%;\r\n");
      out.write("\t }\r\n");
      out.write("\t</style>\r\n");
      out.write("\t\r\n");
      out.write("<title>修改</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
 
	String sId                = new String (request.getParameter("id").getBytes("ISO8859_1"),"UTF-8");
	String sPlan_name         = new String (request.getParameter("plan_name").getBytes("ISO8859_1"),"UTF-8");
	String sDatenum_consuming = new String (request.getParameter("datenum_consuming").getBytes("ISO8859_1"),"UTF-8");
	String sDatenum_interval  = new String (request.getParameter("datenum_interval").getBytes("ISO8859_1"),"UTF-8");
	String sByy               = new String (request.getParameter("byy").getBytes("ISO8859_1"),"UTF-8");
	String sImportance        = new String (request.getParameter("importance").getBytes("ISO8859_1"),"UTF-8");
	String sEmergency         = new String (request.getParameter("emergency").getBytes("ISO8859_1"),"UTF-8");
	String sComplete_flag     = new String (request.getParameter("complete_flag").getBytes("ISO8859_1"),"UTF-8");
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"UpdatePlanServlet\">\r\n");
      out.write("\t<table align=\"center\" width=\"100%\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"20%\">\r\n");
      out.write("\t\t\t\t<label for='label1'>计划（任务）名称</label>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td width=\"80%\">\r\n");
      out.write("\t\t\t\t<!--   input type=\"text\" value=\"");
 out.print(sPlan_name); 
      out.write(" \"  style=\"height:100%;widtd:100%;\" -->\r\n");
      out.write("\t\t\t\t<textarea name=\"textarea_sPlan_name\" cols =\"50\" rows = \"3\">");
 out.print(sPlan_name.replaceAll("<br>","\r\n")); 
      out.write("</textarea>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<label for='label2'>耗时（天）</label>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<!-- input type=\"text\" value=\"");
 out.print(sDatenum_consuming); 
      out.write(" \"  style=\"height:100%;widtd:100%;\" -->\r\n");
      out.write("\t\t\t\t<textarea name=\"textarea_sDatenum_consuming\" cols =\"50\" rows = \"1\">");
 out.print(sDatenum_consuming); 
      out.write("</textarea>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<label for='label2'>间隔（天）</label>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<!-- input type=\"text\" value=\"");
 out.print(sDatenum_interval); 
      out.write(" \"  style=\"height:100%;widtd:100%;\" -->\r\n");
      out.write("\t\t\t\t<textarea name=\"textarea_sDatenum_interval\" cols =\"50\" rows = \"1\">");
 out.print(sDatenum_interval); 
      out.write("</textarea>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<label for='label3'>备注说明</label>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<!--  input type=\"text\" value=\"");
 out.print(sByy); 
      out.write(" \"  style=\"height:100%;widtd:100%;\" -->\r\n");
      out.write("\t\t\t\t<textarea name=\"textarea_sByy\" cols =\"50\" rows = \"10\">");
 out.print(sByy.replaceAll("<br>","\r\n")); 
      out.write("</textarea>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<label for='label4'>重要性</label>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<!-- input type=\"text\" value=\"");
 out.print(sImportance); 
      out.write(" \"  style=\"height:100%;widtd:100%;\" -->\r\n");
      out.write("\t\t\t\t<textarea name=\"textarea_sImportance\" cols =\"50\" rows = \"1\">");
 out.print(sImportance); 
      out.write("</textarea>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<label for='label4'>紧急性</label>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<textarea name=\"textarea_sEmergency\" cols =\"50\" rows = \"1\">");
 out.print(sEmergency); 
      out.write("</textarea>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<label for='label5'>完成情况</label>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<!-- input type=\"text\" value=\"");
 out.print(sComplete_flag); 
      out.write(" \"  style=\"height:100%;widtd:100%;\" -->\r\n");
      out.write("\t\t\t\t<textarea name=\"textarea_sComplete_flag\" cols =\"50\" rows = \"1\">");
 out.print(sComplete_flag); 
      out.write("</textarea>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input name=\"flag_del_an_plan\" type=\"checkbox\" value=\"1\" />是否删除该记录\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<th colspan=\"2\"  >\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"button_id\" value=\"");
 out.print(sId); 
      out.write("\" />\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"修改提交\" />\r\n");
      out.write("\t\t\t</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
