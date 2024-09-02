# Tarea
Framework de Gráficos: Para la visualización de informes, se integró Chart.js, una biblioteca de gráficos basada en JavaScript que permite generar gráficos interactivos de manera sencilla.
Decisiones de Diseño
Modularidad y Escalabilidad: Desde el principio, se decidió seguir un enfoque modular, separando la lógica de negocio, la persistencia y la interfaz de usuario en capas bien definidas. Esto facilita futuras expansiones y mejoras en la aplicación.

Uso de Java EE: Se eligió Java EE como la plataforma subyacente debido a su robustez y a las características integradas como JPA, Servlets, y EJBs, que proporcionan un marco sólido para el desarrollo de aplicaciones empresariales.

Relaciones en JPA: Se optó por una relación ManyToOne entre Tarea y Usuario, lo que refleja un modelo de datos común en aplicaciones de gestión de tareas donde una tarea es asignada a un solo usuario, pero un usuario puede tener múltiples tareas.

Desafíos Encontrados y Soluciones
Configuración del Entorno de Desarrollo:

Desafío: Configurar el entorno de desarrollo con las dependencias correctas y asegurarse de que las herramientas como EntityManager y Stateless Beans funcionen adecuadamente.
Solución: Se dedicó tiempo a asegurar que todas las bibliotecas y dependencias de Java EE estuvieran correctamente configuradas en el IDE (como IntelliJ o Eclipse). La utilización de un servidor de aplicaciones como TomEE simplificó la integración de los componentes de Java EE.
Manejo de Relaciones en JPA:

Desafío: Al implementar la relación ManyToOne entre Tarea y Usuario, hubo dificultades iniciales para garantizar la integridad referencial y evitar problemas como LazyInitializationException.

Solución: 

Se configuró correctamente la carga (fetch) de las relaciones y se utilizó el EntityManager de manera controlada en los Beans para manejar las operaciones de persistencia.
Integración de Chart.js:

Desafío: Integrar gráficos interactivos en las páginas JSP utilizando Chart.js presentó algunos desafíos, particularmente en la sincronización de datos entre el backend Java y el frontend JavaScript.
Solución: Se decidió utilizar un enfoque sencillo donde los datos de los gráficos se pasan como variables JavaScript directamente en las páginas JSP, lo que simplificó la integración y minimizó los errores de sincronización.
Conclusión
El desarrollo de la aplicación de gestión de tareas se realizó siguiendo buenas prácticas de diseño de software y utilizando tecnologías modernas de Java EE. A lo largo del proceso, se tomaron decisiones clave para asegurar que la aplicación sea escalable, mantenible y fácil de usar. Los desafíos encontrados fueron abordados de manera eficiente, permitiendo la entrega de una solución funcional y bien estructurada.
