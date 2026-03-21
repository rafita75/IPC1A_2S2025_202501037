# 📚 Sistema de Gestión de Biblioteca

## 🧠 Descripción del Proyecto

Este proyecto consiste en el desarrollo de un sistema de escritorio en Java que permite gestionar una biblioteca. El sistema permite administrar usuarios, libros y préstamos, así como generar reportes en formato HTML.

El objetivo principal es simular el funcionamiento básico de una biblioteca, aplicando conceptos de programación como estructuras de datos, manejo de archivos, interfaces gráficas y lógica de negocio.

---

## ⚙️ Funcionalidades Principales

### 👤 Usuarios

* Registro de usuarios
* Inicio de sesión
* Manejo de roles (Administrador / Usuario)
* CRUD de usuarios (solo administrador)

---

### 📚 Libros

* Registro de libros con:

  * Código único
  * ISBN único (10 o 13 dígitos)
  * Título
  * Autor
  * Cantidad total y disponible
* Modificación y eliminación de libros
* Validación: no se puede eliminar un libro con préstamos activos

---

### 🔄 Préstamos

* Registro de préstamos
* Validaciones:

  * Máximo 3 préstamos por usuario
  * No permitir préstamos si hay vencidos
  * Validación de stock disponible
* Devolución de libros desde tabla
* Manejo de fechas (préstamo y límite)

---

### 📊 Reportes (HTML + Tabla)

El sistema genera reportes en formato HTML y también los muestra en una tabla dentro del sistema:

* Libros disponibles
* Préstamos activos
* Préstamos vencidos
* Top 5 libros más prestados
* Historial de préstamos por usuario

---

### 📝 Bitácora

Se registra en un archivo `bitacora.txt`:

* Inicio de sesión (exitoso o fallido)
* Cierre de sesión
* Creación, modificación y eliminación de datos
* Operaciones erróneas

---

## 💾 Manejo de Archivos

El sistema utiliza archivos de texto para persistencia de datos:

* `cuentas.txt` → usuarios
* `libros.txt` → libros
* `prestamos.txt` → préstamos
* `bitacora.txt` → registro de acciones

---

## ▶️ Instrucciones de Ejecución

1. Descargar el archivo .jar
2. Ejecutar el archivo .jar
3. Iniciar sesión:

   * Usuario administrador (si está definido en el código)
   * O registrar un nuevo usuario
4. Navegar por el sistema utilizando el dashboard

---

## 🧪 Validaciones Implementadas

* Código de libro único
* ISBN único y válido (10 o 13 dígitos)
* Máximo 3 préstamos activos por usuario
* No permitir préstamos si hay vencidos
* No eliminar libros con préstamos activos

---

## ⚠️ Problemas Encontrados

* Manejo manual de archivos puede generar errores si el formato se altera
* No se implementó base de datos (solo archivos de texto)
* Limitaciones en la interfaz gráfica (Swing)

---

## 🚀 Posibles Mejoras

* Implementar base de datos (MySQL o MongoDB)
* Mejorar la interfaz gráfica (JavaFX o web)
* Agregar autenticación más segura
* Implementar notificaciones de vencimiento
* Exportar reportes a PDF

---

## 👨‍💻 Tecnologías Utilizadas

* Java
* Java Swing
* Manejo de archivos (FileWriter, BufferedReader)
* NetBeans IDE

---
