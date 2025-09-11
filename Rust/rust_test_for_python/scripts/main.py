import rust_core


def main():
    print("Hello World!")
    res = rust_core.add(1, 2)
    print(res)
    print((rust_core.add.__doc__.encode("utf-8")).decode("utf-8"))


if __name__ == '__main__':
    main()