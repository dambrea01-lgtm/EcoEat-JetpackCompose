# 🧱 Capítulo 2 – Contenedores en Jetpack Compose

| [↩️ Volver al inicio del Proyecto](../README.md) | [⬅️ Ir a Capítulo 1](../docs/01-Introduccion.md) |
| :----------------------------------------------: | :----------------------------------------------: |

---

## 📦 Creando nuestro primer proyecto Compose

Antes de empezar a trabajar con los **contenedores** de Jetpack Compose 🧩 —como `Column`, `Row` y `Box`— necesitamos crear nuestro **proyecto base** en Android Studio 💻.

### 🚀 Paso 1: Crear un nuevo proyecto en Android Studio

1️⃣ Abre **Android Studio**  
2️⃣ En la parte superior, haz clic en **“Nuevo Proyecto”** 🆕  
3️⃣ Si tienes una versión anterior de Android Studio, es posible que veas más opciones ⚙️ —¡no te preocupes! el proceso es casi el mismo. Recomiendo que uses la última versión de Android Studio.

### ⚡ Seleccionando el tipo de proyecto

> ⚡ **“Crea tu proyecto en Jetpack Compose”** ⚡

Tienes que seleccionar un proyecto vacio (empty) donde salga este simbolo en forma de **hexágono** y le damos a siguiente (next).

![Proyecto vacio Compose](assets/capitulo-02/img-01.png)

### 📦 Configuración del nuevo proyecto

Ahora completaremos los campos principales del asistente de configuración 👇

#### 1️⃣ Nombre del proyecto 🏷️

Escribe el nombre de tu proyecto.  
Por ejemplo:

> `JetpackComposeCourseBasic`

#### 2️⃣ Nombre del paquete (Package Name) 📦

💡 **¿Qué es el Package Name?**

Cuando compilas tu app 📲 y la subes a la **Play Store**, ese nombre debe ser **único e irrepetible** 🌍.

Por convención, se usa el **dominio web al revés**:

> Si tu dominio es `example.com`, tu paquete sería: `com.example.jetpackcomposecoursebasic`

Esto evita conflictos con otras aplicaciones.

> Aunque podrías escribir cualquier cosa (por ejemplo “.abc”), siempre es mejor seguir el estándar profesional

#### 3️⃣ Save Location 💾

Selecciona la carpeta donde se guardará tu proyecto.

#### 4️⃣ Minimum SDK 📱

Aquí definimos **desde qué versión de Android podrá ejecutarse tu aplicación**.  
Este valor es importante porque determina la **compatibilidad mínima** de tu app con los dispositivos actuales 📲.

> 💡 **Recomendación:** selecciona **Android (API 24)**. Es la opción más equilibrada y recomendada hoy en día, ya que **la mayoría de los dispositivos activos** son compatibles con esta versión o superior.

Esto significa que tu app funcionará perfectamente **desde Android 7 en adelante** 🆙  
y cubrirás un **amplio rango de usuarios** sin preocuparte por versiones antiguas que casi nadie utiliza.

⚠️ Si eliges una API más baja, podrías tener que **adaptar tu código a funciones obsoletas** o limitadas. Por eso, mantenerte en API 24 o superior te garantiza **mejor rendimiento y compatibilidad moderna** 🚀

#### 5️⃣ Build Configuration Language 🧱

Este campo define el lenguaje que usará **Gradle** para compilar tu proyecto.

**Gradle** es la herramienta que:

- ⚡ Construye tu app
- ⚙️ Gestiona dependencias externas (como librerías o APIs 🌐)
- 🧩 Define módulos, versiones y configuraciones

Antes, Gradle usaba **Groovy DSL**, pero las versiones nuevas de Android Studio recomiendan usar **Kotlin DSL** 💪

> Esto significa que tu archivo `build.gradle.kts` estará escrito directamente en **Kotlin**, haciendo más fácil y legible la configuración del proyecto.

![configurando proyecto](assets/capitulo-02/img-02.png)

Entonces seleccionamos **Kotlin DSL**, haz clic en **“Finalizar” 🏁**, y… ¡listo! Android Studio creará automáticamente tu proyecto Compose.

---

(desarrollando)

---

| [⬅️ Ir al Capítulo 1](../docs/01-Introduccion.md) | [⬆️ Ir al inicio del capítulo](#-capítulo-2--contenedores-en-jetpack-compose) | [↩️ Volver al inicio del proyecto](../README.md) |
| :-----------------------------------------------: | :---------------------------------------------------------------------------: | :----------------------------------------------: |
