package com.gzyijian.composite;

/**
 * 抽象组件
 * 
 * @author zmjiangi
 *
 */
public interface Component {
	void operation();
}

/**
 * 叶子组件
 * @author zmjiangi
 *
 */
interface Leaf extends Component {
}

/**
 * 容器组件
 * @author zmjiangi
 *
 */
interface Composite extends Component {
	void add(Component c);

	void remove(Component c);

	Component getChild(int index);
}