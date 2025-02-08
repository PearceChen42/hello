from flask import Flask, render_template, redirect, request, session
from flask_session import Session
from cs50 import SQL

app = Flask(__name__)

db = SQL("sqlite:///store.db")

app.config["SESSION_PERMANENT"] = False
app.config["SESSION_TYPE"] = "filesystem"
Session(app)

@app.route("/")
def index():
    books = db.execute("SELECT * FROM books")
    print(books)
    return render_template("books.html", books=books)


@app.route("/cart", methods=["POST", "GET"])
def cart():
    
    if "cart" not in session:
        session["cart"] = []
    
    if request.method == "POST":
        book_id = request.form.get("id")
        if book_id:
            session["cart"].append(book_id)
        return redirect("/cart")
    
    books = db.execute("SELECT * FROM books WHERE id IN (?)", session["cart"])
    return render_template("cart.html", books=books)