# Crowdfunding & Donation Tracker - Android Native App

Este repositorio contiene una aplicación móvil nativa para la plataforma **Android** desarrollada en **Kotlin**. El proyecto implementa el patrón de arquitectura **MVC (Model-View-Controller)** para resolver de manera estructurada el flujo de registro, seguimiento y gestión de campañas de donaciones, garantizando una separación limpia entre la lógica de negocio y la interfaz de usuario.

## 🚀 Características y Funcionalidades de la App

* **Gestión de Transacciones/Donaciones:** Módulo funcional para la entrada, procesamiento y visualización de montos recaudados en tiempo real.
* **Arquitectura MVC Nativa:** Separación estricta de responsabilidades (Modelos para las entidades de datos, Views representadas por los layouts del sistema y Controladores para la gestión de eventos).
* **Control de Estado Dinámico:** Actualización inmediata de los componentes visuales de la interfaz de cada sesión tras la confirmación de una acción por parte del usuario.
* **Interfaz de Usuario Fluida:** Diseño responsivo adaptado a las directrices de diseño de Android utilizando componentes nativos y Material Design components.

## 🛠️ Stack Tecnológico

* **Lenguaje Principal:** Kotlin
* **Plataforma:** Android SDK (Native)
* **Entorno de Desarrollo:** Android Studio
* **Patrón de Arquitectura:** Model-View-Controller (MVC)
* **Gestión de Dependencias:** Gradle (Kotlin DSL / Groovy)

## ⚙️ Arquitectura del Software móvil y Solución de Problemas

El desarrollo aborda las problemáticas clásicas de la gestión de flujos de datos en dispositivos móviles:

1. **Separación de Responsabilidades:** Se evitó el antipatrón común de sobrecargar las Actividades (*God Activities*). La lógica encargada de calcular los totales de las donaciones se encapsuló en el Modelo, dejando que la Actividad actúe puramente como el Controlador de eventos del ciclo de vida.
2. **Ciclo de Vida de Android:** Manejo seguro de la persistencia de datos temporal en memoria para evitar la pérdida de los estados de donación durante la recreación de las vistas (como en las rotaciones de pantalla).
3. **Manejo de Tipos de Datos:** Uso de estructuras e hilos seguros para procesar transacciones numéricas complejas sin bloquear la interfaz principal de usuario (*UI Thread*).

## 🔧 Configuración e Instalación Local

Para compilar, ejecutar o inspeccionar el código de este portafolio móvil en tu emulador o dispositivo real, sigue estos pasos:

1. **Clonar el repositorio:**
   ```bash
   git clone [https://github.com/longaresf/crowdfunding-android-app.git](https://github.com/longaresf/crowdfunding-android-app.git)
    ```
2. Abrir el proyecto:

    Inicia Android Studio.
    Selecciona File > Open y busca el directorio donde clonaste el repositorio.

3. Sincronización:

    Deja que Android Studio ejecute la sincronización inicial de Gradle para descargar las herramientas y SDKs necesarios declarados en el archivo build.gradle.

4. Despliegue:

    Conecta un dispositivo físico mediante USB Debugging o inicializa un Emulador (AVD).
    Haz clic en el botón Run (ícono de play verde) en la barra superior de Android Studio.

✒️ Autor

    Francisco Longares - Desarrollador Mobile Android - longaresf
   
