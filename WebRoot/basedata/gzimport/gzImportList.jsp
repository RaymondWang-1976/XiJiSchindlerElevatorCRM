<%@ page contentType="text/html;charset=GBK"%>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/tld/html-table.tld" prefix="table"%>
<link rel="stylesheet" type="text/css" href="<html:rewrite forward='formCSS'/>">
<script language="javascript" defer="defer" src="<html:rewrite forward='DatePickerJS'/>"></script>
<html:errors />
<br>

<html:form action="/ServeTable.do">
<html:hidden property="property(genReport)" styleId="genReport" />
  <table>
     <tr>
      <td> 
        &nbsp;&nbsp;维保分部:
      </td>
      <td>
        <html:select property="property(maintDivision)" styleId="maintdivision" onchange="Evenmore(this,'maintstation')">
		  <html:options collection="maintDivisionList" property="grcid" labelProperty="grcname"/>
        </html:select>
      </td>
      <td>
     	 &nbsp;&nbsp;维保站:
      	</td>
    	<td>
    		<html:select property="property(maintstation)" styleId="maintstation">
    			<%-- html:option value="">全部</html:option--%>
		    	<html:options collection="mainStationList" property="storageid" labelProperty="storagename"/>
    		</html:select>
    	</td>
      <td>
      <td> 
        &nbsp;&nbsp;月份:
      </td>
      <td>
        <html:text property="property(yearMonth)" size="12" styleClass="Wdate" onfocus="WdatePicker({dateFmt:'yyyy-MM'})"/>
      </td>
    </tr>   
  </table>
  <br>
  <table:table id="guigzImport" name="gzImporModifyList">
    <logic:iterate id="element" name="gzImporModifyList">
      <table:define id="c_cb">
      	<html:radio property="checkBoxList(ids)" styleId="ids" value="${element.numno}" />
      </table:define>
      <table:define id="c_maintDivision">
        <bean:write name="element" property="maintDivision" />
      </table:define>
      <table:define id="c_maintStation">
        <bean:write name="element" property="maintStation" />
      </table:define>
      <table:define id="c_yearMonth">
         <bean:write name="element" property="yearMonth" />
      </table:define>
      <table:define id="c_gzMoney">
        <bean:write name="element" property="gzMoney" />
      </table:define>
      <table:define id="c_dayMoney">
        <bean:write name="element" property="dayMoney" />
      </table:define>
      <table:define id="c_OperId">
        <bean:write name="element" property="OperId" />
      </table:define>
      <table:define id="c_OperDate">
        <bean:write name="element" property="OperDate" />
      </table:define>

      <table:tr />
    </logic:iterate>
  </table:table>
</html:form>