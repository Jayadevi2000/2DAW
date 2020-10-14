using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class _Default : System.Web.UI.Page
{
    protected void Page_PreInit(object sender, EventArgs e)
    {
        // Aplicar un Tema
        switch (Session["Tema"].ToString())
        {
            case "Azul":
                Page.Theme = "Azul";
                break;
            case "Verde":
                Page.Theme = "Verde";
                break;

        }

        

       
    }

    // Aplicar un tema de hojas de estilo

   /* public override string StyleSheetTheme
    {
        get { return Session["Tema"].ToString(); }

    }*/



        
    





    
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void TextBox1_TextChanged(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {

    }

    protected void Button2_Click(object sender, EventArgs e)
    {
        Response.Redirect("Default2.aspx");
    }
}

