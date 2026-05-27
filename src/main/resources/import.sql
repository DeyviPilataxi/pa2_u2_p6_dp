INSERT INTO estudiante (estu_id,
estu_nombre,
estu_apellido,
estu_genero,
estu_fecha_nacimiento,
estu_cedula)
 
VALUES (nextval('seq_estudiante'),
'deyvi',
 'pilataxi',
  'M',
  '2000-06-20',
  '1234567890');

  INSERT INTO estudiante (estu_id,
estu_nombre,
estu_apellido,
estu_genero,
estu_fecha_nacimiento,
estu_cedula)

VALUES (nextval('seq_estudiante'),
'mishell',
 'sinche',
  'F',
  '2000-07-13',
  '0608377490');

INSERT INTO profesor (prof_id, 
prof_nombre, 
prof_correo, 
prof_telefono, 
prof_direccion)
VALUES (nextval('seq_profesor'), 
'Mathias Pilataxi', 
'mathias@uce.edu.ec', 
'0991234567', 
'Quito Sur');


INSERT INTO profesor (prof_id, 
prof_nombre, 
prof_correo, 
prof_telefono, 
prof_direccion)
VALUES (nextval('seq_profesor'), 
'German Sinche', 
'german@uce.edu.ec', 
'0987654321', 
'Centro Histórico');


INSERT INTO profesor (prof_id, 
prof_nombre, 
prof_correo, 
prof_telefono, 
prof_direccion)
VALUES (nextval('seq_profesor'), 
'Priscila Maria Guaiña', 
'priscila@uce.edu.ec', 
NULL, 
'El Condado');