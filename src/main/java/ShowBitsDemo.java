// Пример реализации алгоритма пузырьковой сортировки

class ВuЬЫе {
    public static void main(String args[]) {
        String strs[] = {"this", "is", "а", "test","of", "а", "string", "sort"};
        String t;
        int a, b;
        int size;
        int c;
        size = strs.length; // количество сортируемьх элементов
        // Отобразить исходный массив
        System.out.print("Иcxoдный массив:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + strs[i]);
        System.out.println();
// Реализовать алгоритм пузырьковой сортировки
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (strs[b - 1].compareTo(strs[b])>0) {
                    t = strs[b - 1];
                    strs[b - 1] = strs[b];
                    strs[b] = t;
                }
            }
        // если требуемый порядок
        // следования не соблюдается,
        // поменять элементы местами

// Отобразить отсортированный массив
        System.out.print("Oтcopтиpoвaнный массив:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + strs[i]);
        System.out.println();


    }
}