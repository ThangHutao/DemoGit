/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ASS1;

/**
 *
 * @author Admin
 */
public class SolarSystem {

    // Lớp Node đại diện cho một phần tử trong danh sách liên kết
    public class Node {

        String name;      // Tên của đối tượng (ví dụ: Sao Thủy, Sao Kim, ...)
        double mass;      // Khối lượng của đối tượng (kg)
        double diameter;  // Đường kính xích đạo (km)
        double SemiMajorAxis;//khoang cach tu hanh tinh den mat troi
        double OrbitalPeriod;// chu ky quy dao
        Node next;        // Con trỏ đến phần tử tiếp theo

        public Node(String name, double mass, double diameter, double SemiMajorAxis, double OrbitalPeriod) {
            this.name = name;
            this.mass = mass;
            this.diameter = diameter;
            this.SemiMajorAxis = SemiMajorAxis;
            this.OrbitalPeriod = OrbitalPeriod;
            this.next = null;
        }
    }

    Node head; // Con trỏ đến phần tử đầu tiên trong danh sách
    Node tail;

    public SolarSystem() {
        this.head = null;
        this.tail = null;

    }

    boolean isEmpty() {
        return head == null;
    }
    void insertLast(String name, double mass, double diameter, double SemiMajorAxis, double OrbitalPeriod){
        Node newnode = new Node(name, mass, diameter, SemiMajorAxis, OrbitalPeriod);
        if(isEmpty()){
            head = tail = newnode;
        }
        else {
            tail.next = newnode;
            tail = newnode;
        }
    }
    void insertFirst(String name, double mass, double diameter, double SemiMajorAxis, double OrbitalPeriod){
        Node newnode = new Node(name, mass, diameter, SemiMajorAxis, OrbitalPeriod);
        if(isEmpty()){
            head = tail = newnode;
        }
        else {
            newnode.next = head;
            head = newnode;
        }
    }
    
//        // Tìm vị trí phù hợp để chèn phần tử mới vào
//        Node current = head;
//        while (current.next != null && current.next.mass < mass) {
//            current = current.next;
//        }
//        newNode.next = current.next;
//        current.next = newNode;
//    }
    // Hàm in danh sách
    public void traverse() {
        Node current = head;
        System.out.println("Solar System Objects (Name, Mass, Diameter,SemiMajorAxis,OrbitalPeriod):");
        while (current != null) {
            System.out.printf("Name: %s, Mass: %.2e kg, Diameter: %.2f km\n,SemiMajorAxis: %2f\n ,OrbitalPeriod: %2f\n",
                    current.name, current.mass, current.diameter,current.SemiMajorAxis,current.OrbitalPeriod);
            current = current.next;
        }
    }
    Node deleteFirst(){
        return null;
    }
// Hàm xử lý các đối tượng theo đường kính xích đạo
    public void processByDiameter() {
        Node current = head;
        System.out.println("Processing objects by equatorial diameter:");
        while (current != null) {
            System.out.printf("Processing: %s (Diameter: %.2f km)\n", current.name, current.diameter);
            current = current.next;
        }
    }

    // Hàm tìm kiếm đối tượng theo tên
    public void searchByName(String name) {
        Node current = head;
        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {
                System.out.printf("Found: Name: %s, Mass: %.2e kg, Diameter: %.2f km\n",
                        current.name, current.mass, current.diameter);
                return;
            }
            current = current.next;
        }
        System.out.println("Object not found!");
    }

    // Hàm xóa đối tượng theo tên
    public void deleteByName(String name) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        if (head.name.equalsIgnoreCase(name)) {
            head = head.next;
            System.out.println("Deleted object: " + name);
            return;
        }
        Node current = head;
        while (current.next != null && !current.next.name.equalsIgnoreCase(name)) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Object not found. Nothing to delete.");
        } else {
            current.next = current.next.next;
            System.out.println("Deleted object: " + name);
        }
    }
}