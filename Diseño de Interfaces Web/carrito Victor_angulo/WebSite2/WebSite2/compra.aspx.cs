using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Collections;
using System.Windows.Forms;

public partial class compra : System.Web.UI.Page
{
    static ArrayList carrito = new ArrayList();
    static ArrayList valores = new ArrayList();
    static double dinero = 0;

    protected void Page_Load(object sender, EventArgs e)
    {
        ValidationSettings.UnobtrusiveValidationMode = System.Web.UI.UnobtrusiveValidationMode.None;

    }

    protected void Timer1_Tick(object sender, EventArgs e)
    {
        LabelFecha.Text = DateTime.Now.ToString("dd/MM/yyyy");
        LabelHora.Text = DateTime.Now.ToString("HH:mm:ss");
    }

    protected void Menu1_MenuItemClick(object sender, MenuEventArgs e)
    {
        if (Menu1.SelectedValue == "AÑADIR AL CARRO")
        {
            MultiView1.ActiveViewIndex = 0;           
        }
        if (Menu1.SelectedValue == "BORRAR DEL CARRO")
        {
            MultiView1.ActiveViewIndex = 1;
            CheckBoxList2.DataSource = carrito;
            CheckBoxList2.DataBind();

             for (var i = 0; i < carrito.Count; i++) {
                 CheckBoxList2.Items[i].Value = valores[i].ToString();
             }

        }
        if (Menu1.SelectedValue == "VER CARRO")
        {
            MultiView1.ActiveViewIndex = 2;
            ListBox1.DataSource = carrito;
            ListBox1.DataBind();
        }
    }

    protected void ButtonAñadir_Click(object sender, EventArgs e)
    {
        for (var i = 0; i < CheckBoxList1.Items.Count; i++)
        {
            if (CheckBoxList1.Items[i].Selected)
            {
                dinero += Convert.ToDouble(CheckBoxList1.Items[i].Value);
                carrito.Add(CheckBoxList1.Items[i].Text);
                valores.Add(CheckBoxList1.Items[i].Value);
            }
        }
        LabelDinero1.Text = dinero.ToString();
        LabelDinero2.Text = LabelDinero1.Text;
        LabelDinero3.Text = LabelDinero1.Text;
    }

    protected void CheckBoxList1_SelectedIndexChanged(object sender, EventArgs e)
    {

    }

    protected void ButtonQuitar_Click(object sender, EventArgs e)
    {
        //var cuenta = CheckBoxList2.Items.Count;
        dinero = Convert.ToDouble(LabelDinero2.Text);
        for (var i = 0; i < CheckBoxList2.Items.Count; i++)
        {
            if (CheckBoxList2.Items[i].Selected)
            {
                //MessageBox.Show(i.ToString() + " " + CheckBoxList2.Items[i].Text);
                dinero -= Convert.ToDouble(CheckBoxList2.Items[i].Value);
                carrito.Remove(CheckBoxList2.Items[i].Text);
                
                valores.Remove(CheckBoxList2.Items[i].Value);
            }
        }
        LabelDinero2.Text = dinero.ToString();
        LabelDinero1.Text = LabelDinero2.Text;
        LabelDinero3.Text = LabelDinero2.Text;
        CheckBoxList2.DataSource = carrito;
        CheckBoxList2.DataBind();

        for (var i = 0; i < carrito.Count; i++)
        {
            CheckBoxList2.Items[i].Value = valores[i].ToString();
        }

    }
}
