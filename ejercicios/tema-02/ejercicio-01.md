# Ejercicio 1: Practicando con contenedores

| [↩️ Volver al inicio del Proyecto](../../README.md) | [↩️ Volver al Capítulo 2](../../docs/02-contenedores.md) |
| :-------------------------------------------------: | :------------------------------------------------------: |

<br/><hr/><br/>

**Ejercicio 1:** Crea un preview que muestre algo similar a la siguiente imagen

<br/>

![agregando Spacer](../../docs/assets/capitulo-02/img-68.png)

<br/>

**Solución:**

Como es el primer ejercicio vamos ir paso a paso, para que vayamos conociendo poco a poco como funciona Jetpack Compose. Por lo tanto, creamos un nuevo proyecto en Android Studio con la plantilla **Empty Compose Activity** le pones un nombre, en mi caso pondre Box001.

- Primero lo que hago es **limpiar el código generado por Android Studio**. Cuando creas un nuevo proyecto con Jetpack Compose, Android Studio genera un MainActivity que suele verse de esta forma:

```kotlin
    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContent {
                Box001Theme {
                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        Greeting(
                            name = "Android",
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                }
            }
        }
    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        Box001Theme {
            Greeting("Android")
        }
    }
```

<br/>

Borramos toda la **@Preview y @Composable** que vienen de ejemplo, porque lo vamos a crear desde cero.

Si observamos la siguiente función **override fun onCreate(savedInstanceState: Bundle?)** del **MainActivity** que es la función primera que se activa cuando abrimos nuestra aplicación, esta sobrecargado para nuestro ejercicio. Por decir, tenemos cosas como estas:

**Scaffold** → añade barras y padding que no necesitamos.
**Greeting()** → función de ejemplo que no vamos a usar.
**innerPadding** → padding automático del Scaffold.
**enableEdgeToEdge()** → opcional, no necesario para ver la Preview.

Si dejamos esto tal cual, la Preview y el emulador no reflejarán exactamente lo que queremos construir.

<br/>

- Dejamos nuestra **MainActivity** limpio. Queremos que la Activity solo haga dos cosas: Aplicar el tema del proyecto (Box001Theme). Llamar a nuestro composable principal, que contendrá los cuadrantes.

Así queda:

```kotlin
    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                Box001Theme {
                    CuadrantesPantalla()
                }
            }
        }
    }
```

<br/>

Ahora la Activity no tiene Scaffold ni Greeting, solo nuestro composable **CuadrantesPantalla()**.

<br/>

- Crear el composable **CuadrantesPantalla()** principal. Fuera de la Activity (la activity hace referencia a la MainActivity), creamos el contenedor donde construiremos los cuadrantes:

```kotlin
    @Composable
    fun CuadrantesPantalla() {
        // Aquí iremos construyendo los cuadrantes paso a paso
    }
```

<br/>

Este composable con la función **CuadrantesPantalla()** será la base de nuestra UI. Tanto la **Preview** como la **Activity** llamarán a este composable, así que siempre verás el mismo resultado.

<br/>

- Finalmente creamos la **Preview** que la llamaremos **PreviewCuadrantes**, escribimos el siguiente código:

```kotlin
    @Preview(showBackground = true)
    @Composable
    fun PreviewCuadrantes() {
        CuadrantesPantalla()
    }
```

<br/>

Aquí decir que si ponemos **showBackground = true** permite ver mejor los colores y bordes de las cajas.

De esta forma ya tenemos el código escrito para que cada vez que modifiques CuadrantesPantalla(), la Preview se actualizará automáticamente.

```kotlin

    //Aquí tienes el código limpio para comenzar a desarrollar nuestro ejercicio

    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                Box001Theme {
                    CuadrantesPantalla()
                }
            }
        }
    }

    @Composable
    fun CuadrantesPantalla() {
        // Aquí iremos construyendo los cuadrantes paso a paso
    }

    @Preview(showBackground = true)
    @Composable
    fun PreviewCuadrantes() {
        CuadrantesPantalla()
    }
```

<br/>

Con esto ya tenemos nuestro entorno preparado para comenzar a desarrollar nuestro ejercicio. Aquí al ser el primer ejercicio de Contenedores, he explicado esto de forma detallada para que no haya duda alguna, pero en los ejercicios no lo voy a explicar tan detallado. Ok, continuamos.

<br/><hr/><br/>

| [⬆️ Ir al inicio del ejercicio](#ejercicio-1-practicando-con-contenedores) | [↩️ Volver al inicio del Proyecto](../../README.md) | [↩️ Volver al Capítulo 2](../../docs/02-contenedores.mdmd) |
| :------------------------------------------------------------------------: | :-------------------------------------------------: | :--------------------------------------------------------: |
