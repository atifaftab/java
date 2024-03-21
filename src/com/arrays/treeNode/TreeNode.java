package com.arrays.treeNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang.math.RandomUtils;

public class TreeNode {
    // Please do not change this helper class
    public static class Node {
        int val;
        List<Node> children;

        int getValue() {
            return val;
        }

        void setValue(int val) {
            this.val = val;
        }

        List<Node> getChildren() {
            return children;
        }

        void setChildren(List<Node> children) {
            this.children = children;
        }

        //New Addition: to print out the value of property "val" the current Node instance holds.
        void info() {
            System.out.print("{val:" + val);
            if (this.children != null) {
                System.out.print("  {");
                for (Node child : this.children) {
                    child.info();
                }
                System.out.print("}  ");
            }
            System.out.print("}");
        }
    }

    //please do not change this enum
    public static enum ORDER {
        ASCENDING, DESCENDING
    }

    public static void getAverage(Node root) {
        /*
          Please implement this method to
          calculate the average of all node values (Node.getValue()) in the tree.
                                root
                             c1      c2
                             c3
                          c4 c5 c6

           The codes must able to support any tree structures even the orphan root which doesn't have children.
           You can create any helper function as needed.
         */
        int[] sumCount = calculateSumAndCount(root);
        double average = (double) sumCount[0] / sumCount[1];
        System.out.println("Average of the node values equals to " + average);
    }

    private static int[] calculateSumAndCount(Node node) {
        if (node == null) {
            return new int[]{0, 0};
        }
        int sum = node.getValue();
        int count = 1;

        if (node.getChildren() != null) {
            for (Node child : node.getChildren()) {
                int[] childSumCount = calculateSumAndCount(child);
                sum += childSumCount[0];
                count += childSumCount[1];
            }
        }
        return new int[]{sum, count};
    }

    public static void sortTree(Node root, ORDER order) {
        sortNode(root, order);
        System.out.println("\nNodes of sorted tree by " + order.toString() + " order:");
        root.info();
    }


    private static void sortNode(Node node, ORDER order) {
        if (node == null || node.getChildren() == null || node.getChildren().isEmpty()) {
            return;
        }

        // Sort children recursively
        for (Node child : node.getChildren()) {
            sortNode(child, order);
        }

        // Sort current node and its children
        sortNodeAndChildren(node, order);
    }

    private static void sortNodeAndChildren(Node node, ORDER order) {
        if (order == ORDER.ASCENDING) {
            node.getChildren().sort(Comparator.comparingInt(Node::getValue));
        } else {
            node.getChildren().sort(Comparator.comparingInt(Node::getValue).reversed());
        }

        if (node.getChildren().size() > 1) {
            List<Node> sortedChildren = new ArrayList<>(node.getChildren());
            if (order == ORDER.ASCENDING) {
                sortedChildren.sort(Comparator.comparingInt(Node::getValue));
            } else {
                sortedChildren.sort(Comparator.comparingInt(Node::getValue).reversed());
            }
            node.setChildren(sortedChildren);
        }
    }

    public static void main(String[] args) {
        try {
            // average
            Node root = new Node();
            root.setValue(RandomUtils.nextInt(100));
            Node c1 = new Node();
            c1.setValue(RandomUtils.nextInt(100));
            Node c2 = new Node();
            c2.setValue(RandomUtils.nextInt(100));
            List<Node> list = new ArrayList<>();
            list.add(c1);
            list.add(c2);
            root.setChildren(list);
            Node c3 = new Node();
            c3.setValue(RandomUtils.nextInt(100));
            list = new ArrayList<>();
            list.add(c3);
            c2.setChildren(list);
            Node c4 = new Node();
            c4.setValue(RandomUtils.nextInt(100));
            Node c5 = new Node();
            c5.setValue(RandomUtils.nextInt(100));
            Node c6 = new Node();
            c6.setValue(RandomUtils.nextInt(100));
            list = new ArrayList<>();
            list.add(c4);
            list.add(c5);
            list.add(c6);
            c3.setChildren(list);
            getAverage(root);
            int total = root.getValue() + c1.getValue() + c2.getValue() + c3.getValue() + c4.getValue() + c5.getValue() + c6.getValue();
            double ans = (double) total / 7;
            System.out.println("Correct answer: " + total + " / 7 = " + ans);

            // traversing and sorting

            Node root2 = new Node();
            root2.setValue(RandomUtils.nextInt(100));
            Node r1 = new Node();
            r1.setValue(RandomUtils.nextInt(100));
            Node r2 = new Node();
            r2.setValue(RandomUtils.nextInt(100));
            Node r3 = new Node();
            r3.setValue(RandomUtils.nextInt(100));
            root2.setChildren(new ArrayList<Node>(java.util.Arrays.asList(r1, r2, r3)));
            Node r4 = new Node();
            r4.setValue(RandomUtils.nextInt(100));
            Node r5 = new Node();
            r5.setValue(RandomUtils.nextInt(100));
            r2.setChildren(new ArrayList<Node>(java.util.Arrays.asList(r4, r5)));
            Node r6 = new Node();
            r6.setValue(RandomUtils.nextInt(100));
            r3.setChildren(new ArrayList<Node>(java.util.Arrays.asList(r6)));

            System.out.println("////////////////////////");
            System.out.println();
            System.out.println("Initial tree structure: ");
            root2.info();
            sortTree(root2, ORDER.ASCENDING);
            sortTree(root2, ORDER.DESCENDING);

        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }
}
