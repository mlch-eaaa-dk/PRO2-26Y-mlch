package iterator.dinerpancakehousemerger;

import java.util.List;
import java.util.NoSuchElementException;

public class PancakeHouseMenuIterator implements Iterator {
	private final List<MenuItem> items;
	private int position = 0;

	public PancakeHouseMenuIterator(List<MenuItem> items) {
		this.items = items;
	}

	@Override
	public MenuItem next() {
		if (!this.hasNext()) throw new NoSuchElementException();

		MenuItem menuItem = items.get(position);
		position = position + 1;
		return menuItem;
	}

	@Override
	public boolean hasNext() {
		return position < items.size();
	}
}
