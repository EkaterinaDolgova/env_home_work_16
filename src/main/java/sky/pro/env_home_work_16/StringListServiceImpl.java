package sky.pro.env_home_work_16;

import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service
public class StringListServiceImpl implements StringListService {
    private String[] lists;

    public StringListServiceImpl() {
        this.lists = new String[4];
        lists[0] = "Tom";
        lists[1] = "Alice";
        lists[2] = "Kate";
        lists[3] = "Sam";
    }


    @Override
    public String add(String item) {
        String[] lists_ = new String[lists.length];
        boolean f_is = false;
        Integer j = 0;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] == item) {
                f_is = true;
            }
        }
        if (f_is = true) {
            return "Дубль";
        } else
            j = lists.length;
        for (int i = lists.length - 1; i > j; i--) {
            lists[i] = lists[i - 1];
        }
        lists[j] = item;
        return lists[j];
    }

    @Override
    public String addIndex(int index, String item) {
        Integer j = 0;
        if (index <= lists.length) {
            j = lists.length + 1;
            for (int i = lists.length - 1; i > j; i--) {
                lists[i] = lists[i - 1];
            }
            lists[j] = item;
            return lists[j];
        }
        throw new StringListNotFoundException("Индекс выходит за пределы фактического количества элементов массива");
    }

    @Override
    public String set(int index, String item) {
        if (index <= lists.length) {
            lists[index] = item;
            return lists[index] = item;
        }
        throw new StringListNotFoundException("Индекс выходит за пределы фактического количества элементов массива");
    }

    @Override
    public String remove(String item) {
        boolean f_is = false;
        Integer j = 0;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] == item) {
                f_is = true;
                j = i;
            }
        }
        if (f_is) {
            for (int i = j; i < lists.length - 1; i++) {
                lists[i] = lists[i + 1];
                return "Запись удалена " + lists[i];
            }

        }
        return "Нет данных";
    }

    @Override
    public String removeIndex(int index) {
        if (index <= lists.length) {
            for (int i = index; i < lists.length; i++) {
                if (lists[i] == lists[index]) {
                    for (int j = index; j < lists.length; j++) {
                        lists[i] = lists[j];
                    }
                }
                lists = Arrays.copyOf(lists, lists.length - 1);
                return "Удалена строка: " + lists[index];
            }
        }
        throw new StringListNotFoundException("Индекс выходит за пределы фактического количества элементов массива");
    }

    @Override
    public boolean contains(String item) {
        boolean f_is = false;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] == item) {
                f_is = true;
            }
        }
        if (f_is) {
            return true;
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        boolean f_is = false;
        Integer j = 0;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] == item) {
                f_is = true;
                j = i;
            }
        }
        if (f_is) {
            return j;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        boolean f_is = false;
        Integer j = 0;
        for (int i = lists.length; i >= 0; i--) {
            if (lists[i].equals(item)) {
                f_is = true;
                j = i;
            }
            f_is = false;
        }
        if (f_is = true) {
            return j;
        }
        return -1;
    }

    @Override
    public String get(int index) {
        if (index <= lists.length) {
            return lists[index];
        }
        throw new StringListNotFoundException("Индекс выходит за пределы фактического количества элементов массива");
    }

    @Override
    public boolean equals(String[] otherList) {
        String[] lists_ = new String[4];
        lists_[0] = "Tom";
        lists_[1] = "Alice";
        lists_[2] = "Kate";
        lists_[3] = "Sam";
        if (lists.equals(lists_)) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        int s = lists.length;
        return s;
    }

    @Override
    public boolean isEmpty() {
        if (lists.length == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        Arrays.fill(lists, null);
    }

    @Override
    public String[] toArray() {
        String[] b = new String[lists.length];
        b = Arrays.copyOf(lists, lists.length);
        return b;
    }

}
