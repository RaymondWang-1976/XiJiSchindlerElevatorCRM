<%@ page contentType="text/html;charset=GBK"%>
<br/>
<!-- ���ϴ��ĸ��� -->
<div id="filemessagestring"></div>
<table width="100%" class="tb">
	<tr>
		<td><b>���ϴ��ĸ���</b></td>
	</tr>
</table>
<table id="uploadtab_1" width="100%" class="tb">
	<thead>
		<tr>
			<td class="wordtd_k2"><div align="center">�ļ�����</div></td>
			<td class="wordtd_k2"><div align="center">�ϴ���</div></td>
			<td class="wordtd_k2"><div align="center">�ϴ�����</div></td>
			<td class="wordtd_k2"><div align="center">����</div></td>
		</tr>
	</thead>
	<logic:present name="updatefileList">
	
		<logic:empty name="updatefileList">
			<tr>
				<td colspan="9" align="center">û�м�¼��</td>
			</tr>
		</logic:empty>
		

		<logic:notEmpty name="updatefileList">
			<logic:iterate id="ele"  name="updatefileList">
				<tr>
				<td class=""><bean:write name="ele" property="oldfilename" /></td>
				<td class=""><bean:write name="ele" property="uploadername" /></td>
				<td class=""><bean:write name="ele" property="uploaddate" /></td>
				<td align="center">
					<input type="button" name="display" value="�� ��"  class="default_input"  onclick="downloadFile('${ele.filesid}')">
				</td>
				</tr>
			</logic:iterate>
		</logic:notEmpty>
	</logic:present>
	
</table>
<%@ include file="UpLoadJS.js" %>
