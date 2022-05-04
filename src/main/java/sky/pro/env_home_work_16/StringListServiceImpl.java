package sky.pro.env_home_work_16;

import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class StringListServiceImpl implements StringListService {
    private final ArrayList<String> lists;

    public StringListServiceImpl() {
        this.lists = new ArrayList<String>();
        lists.add("Tom");
        lists.add("Alice");
        lists.add("Kate");
        lists.add("Sam");
    }


    @Override
    public String add(String item) {
        if (lists.contains(item)) {
            return "Дубль";
        }
        lists.add(item);
        return lists.toString();
    }

    @Override
    public String addIndex(int index, String item) {
        if (index <= lists.size()) {
            lists.add(index, item);
            return lists.toString();
        }
        throw new StringListNotFoundException("Индекс выходит за пределы фактического количества элементов массива");
    }

    @Override
    public String set(int index, String item) {
        if (index <= lists.size()) {
            lists.set(index, item);
            return lists.toString();
        }
        throw new StringListNotFoundException("Индекс выходит за пределы фактического количества элементов массива");
    }

    @Override
    public String remove(String item) {
        if (lists.contains(item)) {
            lists.remove(item);
            return lists.toString();
        }
        return "Нет данных";
    }

    @Override
    public String removeIndex(int index) {
        if (index <= lists.size()) {
            lists.remove(index);
            return lists.toString();
        }
        throw new StringListNotFoundException("Индекс выходит за пределы фактического количества элементов массива");
    }

    @Override
    public boolean contains(String item) {
        if (lists.contains(item)) {
            lists.remove(item);
            return true;
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        if (lists.contains(item)) {
            return lists.indexOf(item);
        }
        return -1;

    }

    @Override
    public int lastIndexOf(String item) {
        if (lists.contains(item)) {
            return lists.lastIndexOf(item);
        }
        return -1;
    }

    @Override
    public String get(int index) {
        if (index <= lists.size()) {
            return lists.get(index);
        }
        throw new StringListNotFoundException("Индекс выходит за пределы фактического количества элементов массива");
    }

    @Override
    public boolean equals(String[] otherList) {
        if (lists.equals(otherList)) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return lists.size();
    }

    @Override
    public boolean isEmpty() {
        if (lists.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        lists.clear();
    }

    @Override
    public String[] toArray() {
        String[] b = new String[lists.size()];
        lists.toArray(b);
        return b;
    }

}
