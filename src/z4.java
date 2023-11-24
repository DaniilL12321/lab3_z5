class CharItem {
    char d; // ключ
    CharItem next; // поле, содержащее ссылку на следующий элемент

    // конструктор:
    CharItem(char value) {
        d = value;
    }
}

class CharStack {
    CharItem top = null; // указатель на вершину стека

    void first(char value) {
        CharItem pv = new CharItem(value);
        pv.next = null;
        top = pv;
    }

    // Занесение в стек
    void push(char value) {
        CharItem pv = new CharItem(value);
        pv.next = top;
        top = pv;
    }

    // Выборка из стека
    char pop() {
        char temp = top.d;
        top = top.next;
        return temp;
    }

    // Поиск элемента в стеке
    boolean search(char value) {
        CharItem current = top;
        while (current != null) {
            if (current.d == value) {
                return true; // элемент найден
            }
            current = current.next;
        }
        return false; // элемент не найден
    }
}

public class z4 {
    public static void main(String[] args) {
        CharStack charStack = new CharStack();
        charStack.first('A');

        // Заносим элементы в стек
        charStack.push('B');
        charStack.push('C');
        charStack.push('D');
        charStack.push('E');

        // Поиск элемента в стеке
        char searchValue = 'C';
        int aaa;
        if (charStack.search(searchValue)) {
            aaa = 1;
        } else {
            aaa = 0;
        }

        // Выводим содержимое стека
        while (charStack.top != null) {
            System.out.print(" " + charStack.pop());
        }
        
        // вывод нахождения в стеке элемента
        if (aaa == 1) {
            System.out.println("\nЭлемент " + searchValue + " найден в стеке.");
        }
        else {
            System.out.println("\nЭлемент " + searchValue + " не найден в стеке.");
        }
    }
}
