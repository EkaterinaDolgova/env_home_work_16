package sky.pro.env_home_work_16;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringListController {
    private final StringListService stringListService;

    public StringListController(StringListService stringListService) {
        this.stringListService = stringListService;
    }

    @GetMapping("/stringlist/add")
    public String add(@RequestParam String item) {
        return stringListService.add(item);
    }

    @GetMapping("/stringlist/addindex")
    public String add(@RequestParam Integer index, @RequestParam String item) {
        return stringListService.addIndex(index, item);
    }

    @GetMapping("/stringlist/set")
    public String set(@RequestParam Integer index, @RequestParam String item) {
        return stringListService.set(index, item);
    }

    @GetMapping("/stringlist/remove")
    public String remove(@RequestParam String item) {
        return stringListService.remove(item);
    }

    @GetMapping("/stringlist/removeindex")
    public String remove(@RequestParam Integer index) {
        return stringListService.removeIndex(index);
    }

    @GetMapping("/stringlist/contains")
    public boolean contains(@RequestParam String item) {
        return stringListService.contains(item);
    }

    @GetMapping("/stringlist/indexOf")
    public int indexOf(@RequestParam String item) {
        return stringListService.indexOf(item);
    }

    @GetMapping("/stringlist/lastIndexOf")
    public int lastIndexOf(@RequestParam String item) {
        return stringListService.lastIndexOf(item);
    }

    @GetMapping("/stringlist/get")
    public String get(@RequestParam Integer index) {
        return stringListService.get(index);
    }

    @GetMapping("/stringlist/equals")
    public boolean equals(@RequestParam("item") String[] otherList) {
        return stringListService.equals(otherList);
    }

    @GetMapping("/stringlist/size")
    public int size() {
        return stringListService.size();
    }

    @GetMapping("/stringlist/isEmpty")
    public boolean isEmpty() {
        return stringListService.isEmpty();
    }

    @GetMapping("/stringlist/clear")
    public void clear() {
    }

    @GetMapping("/stringlist/newlist")
    public String[] toArray() {
        return stringListService.toArray();
    }
}
