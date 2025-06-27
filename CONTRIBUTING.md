Esta guía está pensada para que todos trabajemos con las mismas convenciones y buenas prácticas.

----------------------------------------------------

Estructura de Carpetas

- Las carpetas deben seguir esta estructura:

/clase-01-introduccion/
/clase-02-condicionales/
/clase-03-iteracion/

- Usar **minúsculas y guiones medios (`-`)**.
- No usar espacios, tildes ni símbolos especiales.

----------------------------------------------------

Convención de nombres de archivos

### Archivos Java:
- Usar la convención "PascalCase"(primera letra por palabra en mayúscula) para nombres de clases:
  - `MayorDeDosNumeros.java`
  - `MostrarTemperaturas.java`
- Si hay versiones por integrante:
  - `Ejercicio3_Tomas.java`
  - `Ejercicio3_Rocio.java`

### Archivos Markdown o texto:
- `readme.md`, `instrucciones.md`, `guia-ramas.md`
- Sin espacios ni mayúsculas.

----------------------------------------------------

Uso de ramas

- No trabajar directamente sobre `main` salvo para cambios menores o creación de carpetas vacías.
1- Crear una rama por tarea o ejercicio (se puede hacer desde directamente desde GitHub, o en tu PC si tenés GIT).

1.1- Desde la web GitHub:

	1. Entrá al repositorio.
	2. En el selector de ramas (arriba a la izquierda), escribí el nombre de tu nueva rama:
	3. Hacé clic en "Create branch".
	Luego podés subir archivos o crear código directamente desde esa rama.  
	Cuando termines, GitHub te sugerirá abrir un Pull Request para unir tu rama con `main`.

1.2- Desde GIT:
  ```bash
  git checkout -b clase04-metodos-tomas
  ```
	Subir la rama:
  	```bash
  	git push origin clase04-metodos-tomas
  	```
2- Abrir un Pull Request para integrar tu rama a `main`.

----------------------------------------------------------

Otras buenas prácticas a implementar:

- Hacer `commit`(cambios) con mensajes claros:
  - ✅ `Agrego ejercicio de métodos`
  - ❌ `cambios varios`

- Comentar el código Java para explicar la lógica si es compleja.
- No subir archivos de entorno ni de compilación (respetar `.gitignore`).
- Revisar bien antes de hacer `merge`.

----------------------------------------------------------

¡Gracias por tu contribución! 
