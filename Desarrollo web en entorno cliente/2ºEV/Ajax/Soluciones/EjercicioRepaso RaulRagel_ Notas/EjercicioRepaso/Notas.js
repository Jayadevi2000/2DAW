

var Notas = function(idModulo, nombreAlumno, evaluacion, nota) {

  //formatoModulo(idModulo);
  // this.idModulo = idModulo;
  // this.nombreAlumno = nombreAlumno;
  // this.evaluacion = evaluacion;
  // this.nota = nota;

  if(idModulo == "DWS" || idModulo == "DIW" || idModulo == "DWC" || idModulo == "DAW") this.idModulo = idModulo;
  if(nombreAlumno != "") this.nombreAlumno=nombreAlumno;
  if(evaluacion=="1º" || evaluacion=="2º") this.evaluacion=evaluacion;
  if(nota>=0 && nota<=10) this.nota = nota;
  
};

// function formatoModulo(idModulo){

//   if(idModulo == "DWS" || idModulo == "DIW" || idModulo == "DWC" || idModulo == "DAW"){
//     this.idModulo = idModulo;
//   }else{
//       this.idModulo = "null";
//   }
  
// }

// Notas.prototype.toString = function() {
//   return "-Nombre: "+this.nombreAlumno+", módulo: "+this.idModulo+", evaluación: "+this.evaluacion+", Nota: ["+this.nota+"].";
// }