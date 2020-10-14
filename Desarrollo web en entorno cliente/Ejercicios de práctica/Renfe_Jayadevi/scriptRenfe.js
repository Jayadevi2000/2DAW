var misTrenes[]=new Array();
window.onload=function(){
	var codigo=document.getElementById('codigo');
	//codigo.onchange=MuestraForm;
	var alta=document.getElementById("alta");
	alta.onclick=DarAlta;

	var baja=document.getElementById("baja");
	//baja.onclick=DarBaja;
	alert("hola 1")
}
	function DarAlta(){
			var codigo=document.getElementById('codigo');
			var hsalida=document.getElementById('hsalida');
			var hentrada=document.getElementById('hentrada');
			var tipo=document.getElementsByName('tipo');
			var destino=document.getElementById('destino');
			var circulacion=document.getElementsByName('circulacion');
	alert("hola 2")

			if (codigo.value="" || isNaN(hsalida) || isNaN(hentrada)|| tipo.value==null|| destino.value==null|| circulacion.value==null ){
				alert("Rellena todos los campos");
			}else{
	alert("hola 3")

		for (var i=0;i<misTrenes.length;i++){alert("2 hola"+i);
			if(codigo.value==misTrenes.codigo[i].value){
				alert("Este tren ya existe");
			}else{
					alert("hola 4")
					var tren = new Renfe(codigo, hsalida,hentrada, tipo,destino,circulacion );
		
				tren.anadir(misTrenes);
			}
			alert("hola 5")

	  }
}
	/*function DarBaja(){
		var codigo=document.getElementById('codigo');
			var hsalida=document.getElementById('hsalida').value;
			var hentrada=document.getElementById('hentrada').value;
			var tipo=document.getElementsByName('tipo').value;
			var destino=document.getElementById('destino').value;
			var circulacion=document.getElementsByName('circulacion').value;
				alert("hola 6")

			if (codigo.value="" || hsalida="" || hentrada=""|| tipo=null|| destino=null|| circulacion=null ){
				alert("Rellena todos los campos");
			}else{

		for (var i=0;i<misTrenes.length;i++){	alert("hola 8")

			if(codigo.value!=misTrenes.codigo[i].value){
				alert("Este tren no existe");
			}else{	alert("hola 9")

				misTrenes.eliminar();
			}
		}
	  }
	}
	function MuestraForm(){
var codigo=document.getElementById('codigo');
				alert("hola 10")


	
		for (var i=0;i<misTrenes.length;i++){
			if(codigo.value==misTrenes.codigo[i]){	alert("hola 11")

			document.getElementById('hsalida').value=misTrenes.hsalida;
			document.getElementById('hentrada').value=misTrenes.hentrada;
			document.getElementsByName('tipo').value=misTrenes.tipo;
			document.getElementById('destino').value=misTrenes.destino;
			document.getElementsByName('circulacion').value=misTrenes.circulacion;
				alert("hola 12")
}
		}
	  }
	*/