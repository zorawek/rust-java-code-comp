use std::f32::consts::PI;

pub enum Shape {
    Square(f32),
    Rectangle(f32, f32),
    Triangle(f32, f32),
    Circle(f32),
}

impl Shape {
    pub fn calculate_area(&self) -> f32 {
        match self {
            Shape::Square(side) => side * side,
            Shape::Rectangle(length, breadth) => length * breadth,
            Shape::Triangle(base, height) => 0.5 * base * height,
            Shape::Circle(radius) => PI * radius * radius
        }
    }
}

pub fn calculate_all_areas(shapes: Vec<&Shape>) -> f32 {
    shapes.iter().map(|shape| shape.calculate_area()).sum()
}

fn main() {
    println!("Hello, world!");
}
