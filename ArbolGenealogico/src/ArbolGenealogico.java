public class ArbolGenealogico {
    private Nodo raiz;

    public ArbolGenealogico() {
        this.raiz = null;
    }

    public void insertar(String persona) {
        raiz = insertarRecursivo(raiz, persona);
    }

    private Nodo insertarRecursivo(Nodo nodo, String persona) {
        if (nodo == null) {
            return new Nodo(persona);
        }

        int comparacion = persona.compareTo(nodo.getPersona());

        if (comparacion < 0) {
            nodo.setIzquierda(insertarRecursivo(nodo.getIzquierda(), persona));
        } else if (comparacion > 0) {
            nodo.setDerecha(insertarRecursivo(nodo.getDerecha(), persona));
        }

        return nodo;
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    public Nodo buscar(String persona) {
        return buscarRecursivo(raiz, persona);
    }

    private Nodo buscarRecursivo(Nodo nodo, String persona) {
        if (nodo == null) {
            return null;
        }

        int comparacion = persona.compareTo(nodo.getPersona());

        if (comparacion == 0) {
            return nodo;
        } else if (comparacion < 0) {
            return buscarRecursivo(nodo.getIzquierda(), persona);
        } else {
            return buscarRecursivo(nodo.getDerecha(), persona);
        }
    }

    public void eliminar(String persona) {
        raiz = eliminarRecursivo(raiz, persona);
    }

    private Nodo eliminarRecursivo(Nodo nodo, String persona) {
        if (nodo == null) {
            return null;
        }

        int comparacion = persona.compareTo(nodo.getPersona());

        if (comparacion == 0) {
            if (nodo.getIzquierda() == null) {
                return nodo.getDerecha();
            } else if (nodo.getDerecha() == null) {
                return nodo.getIzquierda();
            } else {
                Nodo sucesor = obtenerSucesor(nodo.getDerecha());
                nodo.setPersona(sucesor.getPersona());
                nodo.setDerecha(eliminarRecursivo(nodo.getDerecha(), sucesor.getPersona()));
            }
        } else if (comparacion < 0) {
            nodo.setIzquierda(eliminarRecursivo(nodo.getIzquierda(), persona));
        } else {
            nodo.setDerecha(eliminarRecursivo(nodo.getDerecha(), persona));
        }

        return nodo;
    }

    private Nodo obtenerSucesor(Nodo nodo) {
        while (nodo.getIzquierda() != null) {
            nodo = nodo.getIzquierda();
        }
        return nodo;
    }

    public void mostrarRecorridoInorden() {
        mostrarRecorridoInordenRecursivo(raiz);
    }

    private void mostrarRecorridoInordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            mostrarRecorridoInordenRecursivo(nodo.getIzquierda());
            System.out.println(nodo.getPersona());
            mostrarRecorridoInordenRecursivo(nodo.getDerecha());
        }
    }

    public void mostrarRecorridoPreorden() {
        mostrarRecorridoPreordenRecursivo(raiz);
    }

    private void mostrarRecorridoPreordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.getPersona());
            mostrarRecorridoPreordenRecursivo(nodo.getIzquierda());
            mostrarRecorridoPreordenRecursivo(nodo.getDerecha());
        }
    }

    public void mostrarRecorridoPostorden() {
        mostrarRecorridoPostordenRecursivo(raiz);
    }

    private void mostrarRecorridoPostordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            mostrarRecorridoPostordenRecursivo(nodo.getIzquierda());
            mostrarRecorridoPostordenRecursivo(nodo.getDerecha());
            System.out.println(nodo.getPersona());
        }
    }

    public void mostrarArbol() {
        System.out.println("Inorden:");
        mostrarRecorridoInorden();
        System.out.println("Preorden:");
        mostrarRecorridoPreorden();
        System.out.println("Postorden:");
        mostrarRecorridoPostorden();
    }

    public int profundidadArbol() {
        return profundidadArbolRecursivo(raiz);
    }

    private int profundidadArbolRecursivo(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }

        int profundidadIzquierda = profundidadArbolRecursivo(nodo.getIzquierda());
        int profundidadDerecha = profundidadArbolRecursivo(nodo.getDerecha());

        return Math.max(profundidadIzquierda, profundidadDerecha) + 1;
    }
}