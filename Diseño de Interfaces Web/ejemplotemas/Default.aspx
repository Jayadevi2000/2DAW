<%@ Page    styleSheetTheme="Azul" Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default"  %>


<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
    <style type="text/css">
        h6 {
            font-family: "Bahnschrift Light";
            font-size: large;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Label" CssClass="nuevoEstilo1"></asp:Label>
&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox1" runat="server" OnTextChanged="TextBox1_TextChanged" ></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="Label"></asp:Label>
&nbsp;&nbsp;
        <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server"  Text="Button" SkinID="otroboton" OnClick="Button1_Click" />
        <input id="Button3" type="button" value="button" /><br />
        <br />
        <br />
        <asp:Button ID="Button2" runat="server" Text="Button" SkinID="botonrojo" OnClick="Button2_Click" />
    
        <br />
        <br />
        <br />
    
    </div>
    </form>
</body>
</html>
