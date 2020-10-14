<%@ Page Language="C#" AutoEventWireup="true" CodeFile="compra.aspx.cs" Inherits="compra" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:UpdatePanel ID="UpdatePanel1" runat="server">
                <ContentTemplate>
                    <asp:ScriptManager ID="ScriptManager1" runat="server">
                    </asp:ScriptManager>
                    <br />
                    <br />
                    <asp:Label ID="LabelFecha" runat="server"></asp:Label>
                    <br />
                    <br />
                    <asp:Label ID="LabelHora" runat="server"></asp:Label>
                    <br />
                    <asp:Timer ID="Timer1" runat="server" Interval="1000" OnTick="Timer1_Tick">
                    </asp:Timer>
                </ContentTemplate>
            </asp:UpdatePanel>
        </div>
        <br />
        <br />
        <asp:Menu ID="Menu1" runat="server" BackColor="#FFFBD6" DynamicHorizontalOffset="2" Font-Names="Verdana" Font-Size="0.8em" ForeColor="#990000" OnMenuItemClick="Menu1_MenuItemClick" Orientation="Horizontal" StaticSubMenuIndent="10px">
            <DynamicHoverStyle BackColor="#990000" ForeColor="White" />
            <DynamicMenuItemStyle HorizontalPadding="5px" VerticalPadding="2px" />
            <DynamicMenuStyle BackColor="#FFFBD6" />
            <DynamicSelectedStyle BackColor="#FFCC66" />
            <Items>
                <asp:MenuItem Text="AÑADIR AL CARRO" Value="AÑADIR AL CARRO"></asp:MenuItem>
                <asp:MenuItem Text="BORRAR DEL CARRO" Value="BORRAR DEL CARRO"></asp:MenuItem>
                <asp:MenuItem Text="VER CARRO" Value="VER CARRO"></asp:MenuItem>
            </Items>
            <StaticHoverStyle BackColor="#990000" ForeColor="White" />
            <StaticMenuItemStyle HorizontalPadding="5px" VerticalPadding="2px" />
            <StaticSelectedStyle BackColor="#FFCC66" />
        </asp:Menu>
        <asp:MultiView ID="MultiView1" runat="server" ActiveViewIndex="0">
            <asp:View ID="View1" runat="server">
                AÑADIR AL CARRO<br />
                <br />
                <asp:CheckBoxList ID="CheckBoxList1" runat="server" OnSelectedIndexChanged="CheckBoxList1_SelectedIndexChanged">
                    <asp:ListItem Value="2,00">ARROZ</asp:ListItem>
                    <asp:ListItem Value="1,60">LECHE</asp:ListItem>
                    <asp:ListItem Value="3,20">QUESO</asp:ListItem>
                    <asp:ListItem Value="5,00">1KG DE PAPAS</asp:ListItem>
                    <asp:ListItem Value="6,00">1KG DE NARANJAS</asp:ListItem>
                    <asp:ListItem Value="0,30">PIPAS</asp:ListItem>
                    <asp:ListItem Value="1,50">COCA-COLA</asp:ListItem>
                    <asp:ListItem Value="35,00">CHAMPAGNE</asp:ListItem>
                    <asp:ListItem Value="1,00">MISSILE</asp:ListItem>
                    <asp:ListItem Value="0,50">PAN</asp:ListItem>
                    <asp:ListItem Value="1,70">5L DE AGUA</asp:ListItem>
                    <asp:ListItem Value="4,20">HELADO</asp:ListItem>
                    <asp:ListItem Value="3,60">POLLO FRITO</asp:ListItem>
                </asp:CheckBoxList>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Total en el carro:
                <asp:Label ID="LabelDinero1" runat="server"></asp:Label>
                &nbsp;€<br />
                <br />
                &nbsp;&nbsp;&nbsp;
                <asp:Button ID="ButtonAñadir" runat="server" OnClick="ButtonAñadir_Click" Text="añadir al carro" />
                <br />
            </asp:View>
            <asp:View ID="View2" runat="server">
                BORRAR DEL CARRO<br />
                <br />
                <asp:CheckBoxList ID="CheckBoxList2" runat="server" >
                </asp:CheckBoxList>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Total en el carro:
                <asp:Label ID="LabelDinero2" runat="server"></asp:Label>
                &nbsp;€<br />
                <asp:Button ID="ButtonQuitar" runat="server" Text="quitar del carro" OnClick="ButtonQuitar_Click" />
                <br />
            </asp:View>
            <asp:View ID="View3" runat="server">
                VER CARRO<br />
                <br />
                <br />
                <asp:ListBox ID="ListBox1" runat="server"></asp:ListBox>
                <br />
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Total en el carro:
                <asp:Label ID="LabelDinero3" runat="server"></asp:Label>
                &nbsp;€
            </asp:View>
        </asp:MultiView>
        <br />
    </form>
</body>
</html>
