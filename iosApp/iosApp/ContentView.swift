import SwiftUI
import shared

func greet() -> String {
    return Greeting().greeting()
}

struct ContentView: View {
    let todoModel = TodoModel() // Add

    var body: some View {
        Text(todoModel.addTodo(title: "抹茶もち").title) // Add
//         Text(todoModel.fetchTodos()[0].title)
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
