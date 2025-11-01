# 🚀 Introducción Jetpack Compose - EcoEat

## Introducción

Quizás muchos de ustedes vienen de trabajar con Android clásico (XML) 📄,  
algunos quizás nunca han trabajado con Android 😅.

La idea de este tutorial es crear una aplicación **desde el diseño hasta la implementación**, incluso aplicando algún patrón de arquitectura. Primero conoceremos bien las bases de **Jetpack Compose 💻** y luego iremos madurando este proyecto 🌱 para ponerlo en práctica ✨.

![jetpack compose](assets/introduccion-01.png)

Jetpack Compose no es el futuro, es **el presente de Android 🚀📱**. Actualmente entre el 10% y 15% de las aplicaciones en Play Store 🛒 ya están escritas en Compose 😱🔥.

Exploraremos:

- Qué nos ofrece Compose 💡
- Su enfoque multiplataforma 🌍
- Nuevas características y buenas prácticas 🧭

---

## Kotlin y desarrollo nativo

Trabajaremos con **Kotlin ☕** y desarrollo nativo Android 🤖.  
Otras alternativas multiplataforma: Flutter 🐦, React Native ⚛️, Xamarin/Maui 🧱.

¿Por qué Kotlin?

En este proyecto vamos a utilizar **Kotlin**, y lo hacemos principalmente por tres razones clave 🔑 que lo hacen ideal para el desarrollo moderno en Android:

![logotipo kotlin](assets/introduccion-02.png)

### 1️⃣ Expresivo y conciso ✂️

- Kotlin permite escribir **menos código 📝**, pero más legible y mantenible.

**Ejemplo práctico:**

```text
// Java
TextView textView = findViewById(R.id.textView);
textView.setText("Hola Mundo");

// Kotlin
textView.text = "Hola Mundo"
```

- Como se ve, con Kotlin logramos el mismo resultado con mucho menos código, más limpio y fácil de entender.

### 2️⃣ Código seguro 🛡️ (Null Safety)

- Uno de los problemas más comunes en Android (y Java) son los **`NullPointerException`** 💥.

- Kotlin introduce **null safety**, que obliga a declarar cuándo una variable puede ser `null` y cuándo no, reduciendo la probabilidad de errores críticos ⚠️.

**Ejemplo:**

```kotlin
var nombre: String = "Juan"   // No puede ser null
var apellido: String? = null  // Puede ser null
```

- Si intentamos usar una variable que puede ser null sin verificarla, Kotlin nos marcará un warning ⚠️ o error durante la compilación.

- Esto significa que muchos errores que antes aparecían en tiempo de ejecución 😱 ahora los detectamos antes de correr la app ✅, aumentando la estabilidad y confiabilidad de nuestro código.

### 3️⃣ Interoperabilidad 🌐

- Kotlin es 100% interoperable con Java ☕, lo que significa que podemos usar todas las librerías y clases de Java dentro de nuestro proyecto Android 📱 sin problemas.

- Esto facilita migrar proyectos existentes, mezclar código y aprovechar todo el ecosistema de Android de manera fluida ✅.

**Ejemplo:**

```kotlin
// Usando una clase de Java en Kotlin
val date = java.util.Date()
println("Fecha actual: $date")
```

- Gracias a esta interoperabilidad, podemos combinar lo mejor de ambos mundos: la seguridad y concisión de Kotlin junto con la robustez y madurez de Java.

---

TODO: Continuamos con la definición de que es Jetpack Compose.
