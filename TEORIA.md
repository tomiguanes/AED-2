🔹 HashSet (TP9)
Es un conjunto: no permite elementos duplicados y no mantiene orden.
Declaración: HashSet<String> conjunto = new HashSet<>();
Métodos principales:
.add(elem) → agrega (si no existe).
.remove(elem) → elimina.
.contains(elem) → verifica existencia.
.size() → devuelve cantidad.
.clear() → borra todo.
Operaciones entre conjuntos:
.addAll(otroSet) → unión.
.retainAll(otroSet) → intersección.
.removeAll(otroSet) → diferencia.
👉 Se usa cuando queremos guardar valores únicos (ej: correos, usuarios).
