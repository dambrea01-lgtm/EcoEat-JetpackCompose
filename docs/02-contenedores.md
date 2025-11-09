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

Entonces seleccionamos **Kotlin DSL**, haz clic en **“Finalizar” 🏁**, y… ¡listo! Android Studio creará automáticamente tu proyecto Compose. Desde mi version de android studio (Android Studio Narwhal 3 Feature Drop | 2025.1.3) obtengo:

![nuevo proyecto abierto](assets/capitulo-02/img-03.png)

---

## 🚀 Primer paso: entender la estructura base del proyecto

Cada vez que creamos un proyecto nuevo en Android Studio, se genera una clase principal llamada MainActivity 📄.

![main activity](assets/capitulo-02/img-04.png)

Esta clase es el punto de partida de nuestra aplicación: es la primera pantalla por donde el sistema operativo Android ingresa cuando abrimos la app 🔑.

📁 Estructura básica del proyecto

En el panel izquierdo de Android Studio (explorador de archivos) verás varias carpetas.
No analizaremos todas, pero sí las más importantes para esta sesión 👇:

📦 Carpeta app

Dentro de esta carpeta está todo el código de la aplicación.
Ahí verás otras subcarpetas clave:

1️⃣ manifests/

Contiene el archivo AndroidManifest.xml 🧾

![manifests](assets/capitulo-02/img-05.png)

Aquí se declaran los permisos de la app (📷 cámara, 📍 geolocalización, 🌐 internet, etc.). También se puede definir el icono de la aplicación y otras configuraciones generales.

👉 Por ahora, recuerda que aquí controlamos permisos y metadatos del proyecto.

2️⃣ kotlin + java/

![carpeta kotlin + java](assets/capitulo-02/img-06.png)

Dentro verás tres carpetas:

La principal, donde está el código de la app y dos carpetas adicionales para pruebas o testing 🧪 (las veremos más adelante)

Cuando abres la carpeta principal (que tiene el nombre de tu paquete, por ejemplo com.midominio.miapp), verás los archivos del proyecto.Los más importantes por ahora son:

![carpeta com.midominio.miapp](assets/capitulo-02/img-07.png)

🧭 MainActivity.kt — el archivo donde inicia la app

🎨 Carpeta ui/ — contiene los colores, temas y tipografías de la interfaz

🎨 Dentro de la carpeta ui/

Aquí configuramos todo el estilo visual de la aplicación: Colores del tema (modo claro 🌞 y modo oscuro 🌙); Tipografía que se usará; Configuraciones de Material Design 3, la guía moderna de diseño de Android

**⚙️ La clase MainActivity.kt**

Volviendo al archivo principal (**MainActivity.kt**), esta clase se ejecuta apenas abrimos la aplicación. Dentro de ella hay una función muy importante llamada:

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
        // Aquí va TODO el contenido visual de Jetpack Compose
    }
}
```

![funcion onCreate dentro de la clase MainActivity](assets/capitulo-02/img-08.png)

📲 onCreate() se activa automáticamente al iniciar la app y muestra la primera pantalla

🧩 Todo lo que creemos con **Jetpack Compose** se debe escribir dentro de la función **setContent { ... }**

🔹 Aquí declararemos nuestras vistas, botones, textos, imágenes, etc.
🔹 Si Android Studio genera un código de ejemplo (como un “Hello Android”), puedes borrarlo 🧹 para empezar desde cero con tu propia interfaz.

![vaciamos el contenido del setContent](assets/capitulo-02/img-09.png)

Y para finalizar borra tambien todo lo que selecciono en la imagen siguiente debajo de la clase MainActivity (todo el @Composable y la @Preview), luego explicaremos como crearlo nosotros mismo, y que significa.

![borrando el @Composable y la @Preview](assets/capitulo-02/img-10.png)

Vamos a empezar desde cero. No quiero que nos confundamos. Tu archivo debe quedar así:
👉 Solamente un setContent { } vacío.

![punto de partida solo setContent](assets/capitulo-02/img-11.png)

---

(desarrollando)

---

| [⬅️ Ir al Capítulo 1](../docs/01-Introduccion.md) | [⬆️ Ir al inicio del capítulo](#-capítulo-2--contenedores-en-jetpack-compose) | [↩️ Volver al inicio del proyecto](../README.md) |
| :-----------------------------------------------: | :---------------------------------------------------------------------------: | :----------------------------------------------: |
