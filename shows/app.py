from flask import Flask, render_template, redirect, request, session, jsonify
from cs50 import SQL
from flask_session import Session


app = Flask(__name__)

db = SQL("sqlite:///shows.db")

@app.route("/")
def index():
    return render_template("index.html")


@app.route("/search")
def search():
    query = request.args.get("q")
    if query:
        shows = db.execute("SELECT title,rating FROM shows JOIN ratings ON shows.id = ratings.show_id WHERE title LIKE ?", "%" + query + "%")
    else:
        shows = []
    return jsonify(shows)