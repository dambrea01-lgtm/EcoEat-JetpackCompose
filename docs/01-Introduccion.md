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

## 🧩 ¿Qué es Jetpack Compose?

Jetpack Compose es un **kit de herramientas 🧰 para construir interfaces nativas** 🎨🖥️ de forma **declarativa 📜**. Esto significa que, en lugar de describir _cómo_ se debe dibujar cada elemento en pantalla, simplemente describes _qué_ quieres que aparezca y Compose se encarga del resto.

- XML 📄 sigue siendo muy relevante: alrededor del 90% de las apps todavía lo usan. ❌
- Jetpack Compose 🧩 está creciendo rápidamente: ya cubre el 10% y se espera que sea el futuro 🚀.
- Compose es **interoperable con XML**, por lo que puedes combinar ambos enfoques.

**Ventaja clave:** Compose simplifica enormemente el trabajo y es cada vez más solicitado en el mundo laboral . Tener experiencia en Compose además de XML es un **plus para nuestro currículum ➕**.

---

## 📱 Plataformas compatibles con Jetpack Compose

Jetpack Compose no se limita a Android:

- **Móvil 📱**: completamente productivo
- **Escritorio 🖥️**: ya se puede usar en producción
- **Web 🌐**: actualmente en beta, pero en camino a producción
- **Wearables ⌚**: también listo para usar

🎯 **Foco del aprendizaje:** dominar Compose para **todas las plataformas posibles** 🌍💻📱⌚

---

## ⚙️ Kotlin Multiplatform (KMP)

Antes conocido como **KMM**, ahora llamado **Kotlin Multiplatform 💥**, permite **compartir la lógica del negocio** entre diferentes plataformas, evitando duplicar código.

### Problema con apps nativas

Si quieres desarrollar para Android y iOS de manera nativa:

1. Necesitas un proyecto en Kotlin para Android
2. Otro proyecto en Swift para iOS

😩 Esto genera mucho trabajo y duplicación.

### Ventajas de KMP

Con KMP 🌐:

- Un solo proyecto con un solo lenguaje 💻
- Compartes **core del negocio, reglas y llamadas a APIs** ✅
- Solo la interfaz se desarrolla nativamente:
  - Jetpack Compose para Android 📱
  - SwiftUI para iOS 🍏

**Resultado:** más eficiencia y menos duplicación de código

---

## 🔬 Estado de desarrollo y versiones

Cuando se lanza una nueva tecnología, pasa por estas etapas:

1. **Experimental** 🧪
2. **Alpha** ⚗️
3. **Beta** 🧪
4. **Producción** 🏁

Actualmente:

- Jetpack Compose: **Productivo ⚙️**
- KMP: **Beta 🧪**, se espera producción pronto 🚀

---

## 🔮 Futuro: Compose + Kotlin Multiplatform (KMP)

Si pensamos en el futuro de las apps multiplataforma 🌍:

- KMP se basa en **Compose**, no en XML 📄❌
- La idea es **usar Compose para toda la UI 🎨** y Kotlin para **toda la lógica compartida 🧩**
- Beneficios:
  - Una sola base de código
  - Diseño unificado para Android 📱 y iOS 🍏
  - Lógica de negocio compartida y fácil de mantener

---

## ⚖️ Flutter vs Kotlin Multiplatform

Comparando **Flutter 💙** y **KMP**:

- Flutter: rápido ⚡, excelente documentación 📚, muchos widgets listos
- KMP: flexibilidad, cercanía al entorno nativo Android/iOS 🧩, fácil de compartir código base

Ejemplo: si creas una app para iPad 🍎 que use el Apple Pencil ✏️:

- Con KMP: toda la lógica en Kotlin 💻, solo la UI específica en Swift 🍏
- Con Flutter: necesitas librerías nativas o integrar código nativo manualmente 😩

En resumen:

> Kotlin Multiplatform = flexibilidad + código compartido 💪  
> Flutter = rapidez + ecosistema de widgets ⚡

---

## 🧩 Ktor: APIs en Kotlin

Otra herramienta interesante: **Ktor ⚙️**, un framework en Kotlin 💻 para crear APIs.  
Ejemplo práctico: puedes hacer llamadas a una base de datos MySQL 🐘 usando **solo Kotlin** 💪

Actualmente, **Spring Boot 🍃 + Kotlin** también es muy popular y es fácil crear proyectos desde el IDE con Kotlin como lenguaje principal

---
